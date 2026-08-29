//  -- Declaring hash array and counting character from a string of lowercase --

import java.util.*;

public class StringHash {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();

        //Precalculation

        int[] hash = new int[26] ;
        for (int i = 0 ; i < s.length() ; i++) {
            hash[s.charAt(i) - 'a']++ ;
        }

        System.out.print("Enter the character for count : ");
        char character = sc.next().charAt(0);

        System.out.println(hash[character-'a']);

        sc.close();
    }
}
