/*
A 
A B 
A B C 
A B C D 
A B C D E 
*/

import java.util.Scanner;

public class pattern14 {
  static void print14(int n){
    for(int i = 0; i < n; i++){
      for(char ch = 'A'; ch <= 'A'+ i ; ch++ ){
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the n : ");
    int n = sc.nextInt();
    print14(n);
    sc.close();
  }
}
