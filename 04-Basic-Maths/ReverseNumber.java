import java.util.*;

public class ReverseNumber {

    static int reverse(int num) {

        int lastdigit ;
        int reverse_no = 0 ;
        while ( num > 0) {
            lastdigit = num % 10;
            num /= 10;
            reverse_no = (reverse_no * 10) + lastdigit;
        }
        return reverse_no ;
    }
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        int num ;

        if ( x > 0) {
            num = x;
            System.out.println(reverse(num));
        }
        else if ( x < 0) {
            num = -(x);
            System.out.println(-reverse(num));
        } else {
            System.out.println(0);
        }
    }
}
