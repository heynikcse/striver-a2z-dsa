//Check a number is Armstrong or not .

import java.util.*;

public class ArmstrongNumber {

    static boolean isArmstrong(int x) {

        int dup = x ;
        int sum = 0 ;

        while( x > 0 ){
            int lastdigit = x % 10 ;
            sum = sum + (lastdigit * lastdigit * lastdigit) ;
            x /= 10 ;
        }
        return dup == sum;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt() ;

        System.out.println(isArmstrong(x));
    }
}
