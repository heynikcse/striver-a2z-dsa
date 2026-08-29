//Factorial of n number by using recursion only.

import java.util.*;

public class Factorial
{
    static int fact(int n){
        if ( n == 0 ){
            return 1;
        }
        return n * fact(n - 1);
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.println(fact(n));
    }
}
