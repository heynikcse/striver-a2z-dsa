// Given a digit d (0 to 9), find the sum of the first 50 positive integers (integers > 0) that end with digit d.
// A number ends with digit d if its last digit is d.


import java.util.Scanner;

public class Whileloop
 {
  public static void main(String[] args) {
    int sum = 0;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the last digit between 0 to 9: ");
    int d = sc.nextInt();

    if ( d == 0 ){
      d = 10;
    }

    int n = 1;
    while (n <= 50) {
      sum += d ;
      System.out.print(d + " + ");
      d += 10;
      n ++;
    }
    System.out.println(" = " + sum);
  }
}

 