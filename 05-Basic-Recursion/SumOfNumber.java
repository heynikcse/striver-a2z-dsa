//Sum of n numbers - Recursion ONLY backtrack

import java.util.*;

public class SumOfNumber {

    //Parametrised
//    static void print1(int i , int sum ){
//        if ( i < 1 ){
//            System.out.println(sum);
//            return;
//        }
//        print(i-1, sum+i);
//    }

    //Functional Way
    static int print2(int n){
        if( n== 0 ){
            return 0 ;
        }
        return n + print2(n - 1);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

//        print(n, 0);
        System.out.println(print2(n));
    }
}
