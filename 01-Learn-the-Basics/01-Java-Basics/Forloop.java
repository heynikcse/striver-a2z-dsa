// Given two integers low and high, return the sum of all integers from low to high inclusive.

import java.util.Scanner;

public class Forloop {
  public static void main(String[] args) {

    int sum = 0;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the lower number: ");
    int low = sc.nextInt();
    System.out.print("Enter the higher number: ");
    int high = sc.nextInt();

    for(int i = low ; i <= high ; i ++ ) {
      sum += i;
      System.out.print(i + " + ");
    }
    System.out.println(" = " + sum);
  }
}
