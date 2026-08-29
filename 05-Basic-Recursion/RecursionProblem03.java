//Print from n to 1

import java.util.*;

public class RecursionProblem03 {

    static void print(int i , int n ){

        if ( i < 1) {
            return ;
        }
        System.out.println(i);
        print(i-1, n);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        print( n , n) ;
    }
}
