import java.util.*;

public class Euclidean {

    static void gcd(int a, int b){

        while ( a > 0 && b > 0){
            if ( a>b ){
                a = a % b;
            } else {
                b = b % a ;
            }
        }
        if ( a == 0 ){
            System.out.println(b);
        }else {
            System.out.println(a);
        }
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        System.out.print("GCD of "+ a + " and " + b + " is : ");

        gcd(a, b);

    }
}
