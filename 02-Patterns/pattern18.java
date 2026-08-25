/*
E
DE
CDE
BCDE
ABCDE
*/

import java.util.Scanner;

public class pattern18 {
  
  static void print18(int n){
    for(int i = 0 ; i < n ; i++){
      char start = (char)('A' + (n-i-1)) ;
      for(int j = 0; j <= i ; j++) {
        System.out.print(start);
        start ++ ;    
      }
      System.out.println();
    }
    
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the n : ");
    int n = sc.nextInt();
    print18(n);
    sc.close();
  }
}
