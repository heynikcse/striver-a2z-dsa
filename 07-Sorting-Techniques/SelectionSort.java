import java.util.*;

public class SelectionSort {

    static void selectionsort(int[] arr) {

        for(int i = 0 ; i <= arr.length - 2 ; i++) {
            int min = i ;
            for(int j = i ; j <= arr.length - 1 ; j++) {
                if( arr[j] < arr[min] ) {
                    min = j;
                }
            }
            int temp = arr[min] ;
            arr[min] = arr[i];
            arr[i] = temp ;
        }
    }

    static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element : ");
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }

        selectionsort(arr);

        //Transverse the array :
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
