//  -- Declaring hash array and counting element from an array --

import java.util.*;

public class CountElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the element of array : ");
        for(int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
        }

        //Precompute

        int[] hash = new int[13];
        for(int i = 0 ; i < n ; i++){
            hash[array[i]] += 1 ;
        }


        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.println(hash[number]);

    }
}
