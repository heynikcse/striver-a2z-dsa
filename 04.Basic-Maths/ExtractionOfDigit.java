import java.util.Scanner;
public class ExtractionOfDigit {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int last_digit ;

        while(n > 0) {
            last_digit = n % 10; //as a form of remainder
            n /= 10 ;
            System.out.println(last_digit);
        }
    }
}
