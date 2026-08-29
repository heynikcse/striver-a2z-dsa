//Print name n times using recursion

import java.util.*;

public class RecursionProblem01 {

    static void name(int i , int n ){
        if( i > n) {
            return ;
        }
        System.out.println("Nikhil");
        name(i+1, n);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of time you want to print name : ");
        int n = sc.nextInt();

        name(1, n);
    }
}
