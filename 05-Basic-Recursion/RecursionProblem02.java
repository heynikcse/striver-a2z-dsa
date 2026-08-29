//Print linearly from 1 to n

import java.util.*;

public class RecursionProblem02 {

    static void print(int i , int n ){
        if(i > n){
            return;
        }
        System.out.println(i);
        print(i+1, n);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        print(1,n);
    }
}
