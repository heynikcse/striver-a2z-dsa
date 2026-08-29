// 7. Reverse Integer
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

import java.util.Scanner;

public class LeetCode_7_ReverseInteger {
    static int reverse(int x) {

        long reverse_no = 0 ;

        while( x != 0 ){
            int lastdigit = x % 10 ;
            reverse_no = (reverse_no * 10) + lastdigit ;
            x /= 10 ;
        }

        if (reverse_no > Integer.MAX_VALUE ||
                reverse_no < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)reverse_no ;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        System.out.println(reverse(x));
    }
}
