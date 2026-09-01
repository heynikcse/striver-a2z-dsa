import java.util.Scanner;

public class BubbleSort {

    static void bubbleSort(int[] arr) {

        int n = arr.length;
        for (int i = n - 1; i >= 1; i--) {

            int didSwap = 0 ;

            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1 ;
                }
            }

            if ( didSwap == 1 ){   // IF NO SWAP HAPPEN LOOP BREAKS MEANS ARRAY IS ALREADY SORTED AND TC = O(n)
                break;
            }
        }
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        //Transverse the array :
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
