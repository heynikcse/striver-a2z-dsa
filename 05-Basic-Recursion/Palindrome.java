// -- Checking a number is palindrome or not by true and false --

import java.sql.SQLOutput;
import java.util.*;

public class Palindrome {

    static boolean isPalinndrome(int i , String s){

        int n = s.length();

        if( i >= n/2) {
            return true;
        }

        if( s.charAt(i) != s.charAt(n-i-1) ){
            return false;
        }
        return isPalinndrome(i+1, s);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String s = sc.nextLine();

        System.out.println(isPalinndrome(0 , s));
    }
}
