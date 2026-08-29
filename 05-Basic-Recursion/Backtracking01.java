//Print linearly from 1 to n but by backtracking

import java.util.*;

public class Backtracking01 {

    static void print(int i , int n ){
        if ( i < 1) {
            return;
        }
        print(i - 1 , n);
        System.out.println(i);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        print(n , n) ;
    }
}
