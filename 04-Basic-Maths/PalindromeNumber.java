// Leetcode problem 9. Palindrome Number
//Given an integer x, return true if x is a palindrome, and false otherwise. Also reject negative numbers

import java.util.*;

public class PalindromeNumber {

    static void palindrome(int x) {
        int dup = x ;

        int reverse_no = 0;
        while (x > 0) {  // reject negative number
            int lastdigit = x % 10;
            reverse_no = (reverse_no * 10) + lastdigit;
            x /= 10;
        }
        if ( dup == reverse_no) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();

        palindrome(x);
    }
}
