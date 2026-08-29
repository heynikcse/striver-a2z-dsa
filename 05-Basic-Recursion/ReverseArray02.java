//Reverse an Array by using ONE Pointers.

import java.util.Scanner;

public class ReverseArray02 {

    static void reverse(int[] arr , int i){
        int n = arr.length ;
        if( i >= n/2 ){
            return;
        }

        int temp = arr[i] ;
        arr[i] = arr[n-i-1] ;
        arr[n-i-1] = temp ;

        reverse(arr , i+1);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n] ;

        System.out.println("Enter the elements : ");

        for(int i=0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(arr, 0);

        for(int i=0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
