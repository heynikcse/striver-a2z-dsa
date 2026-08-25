/*
A
BB
CCC
DDDD
EEEEE
*/

import java.util.Scanner;

public class pattern16 {
  static void print16(int n){
    char ch = 'A';
    for(int i = 0 ; i < n; i++){
      for(int j =0; j <= i; j++) {
        System.out.print(ch);
      }
      ch += 1;
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the n : ");
    int n = sc.nextInt();
    print16(n);
    sc.close();
  }
}
