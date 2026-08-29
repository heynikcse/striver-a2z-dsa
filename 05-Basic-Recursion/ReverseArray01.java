//Reverse an Array by using Two Pointers.

import java.util.Scanner;

public class ReverseArray01 {

    static void reverse(int[] arr , int l , int r){
        if( l >= r ){
            return;
        }

        int temp = arr[l] ;
        arr[l] = arr[r] ;
        arr[r] = temp ;

        reverse(arr , l+1, r-1);
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

        reverse(arr, 0 , arr.length - 1);

        for(int i=0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
