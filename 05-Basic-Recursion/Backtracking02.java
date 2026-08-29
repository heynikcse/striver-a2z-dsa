//Print linearly from n to 1 but by backtracking

import java.util.*;

public class Backtracking02 {

    static void print(int i , int n ){
        if( i > n ){
            return;
        }
        print( i +1 , n);
        System.out.println(i);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        print(1, n);
    }
}
