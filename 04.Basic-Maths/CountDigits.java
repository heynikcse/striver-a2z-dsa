//Given the number 'n'. find out and return the number of digits present in a number.

//We can solve the problem by using extraction of digits.

import java.util.Scanner;
public class CountDigits {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int count = 0 ;

        while(n > 0) {
            n /= 10 ;
            count ++ ;
        }
        System.out.println(count);
    }
}