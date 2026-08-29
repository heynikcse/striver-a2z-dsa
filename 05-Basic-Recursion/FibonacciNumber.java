// -- Give the output of the number at nth place in fibonacci series starting from 0th place --

import java.util.*;

public class FibonacciNumber {

    static int fibonacci(int n){
        if ( n <= 1 ){
            return n;
        }
        int last = fibonacci(n - 1);
        int slast = fibonacci(n - 2);

        return last + slast ;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the place : ");
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
    }
}
