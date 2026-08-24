/*
1        1
12      21
123    321
1234  4321
1234554321
*/
import java.util.Scanner;

public class pattern12 {
  static void print12(int n) {
    for(int i =1; i < n+1; i++){
      for(int j =1 ; j <= i; j++){
        System.out.print(j);
      }
      for(int k =0; k < (2*n - 2*i); k++){
        System.out.print(" ");
      }
      for(int l=i; l>0; l--){
        System.out.print(l);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the n : ");
    int n = sc.nextInt();
    print12(n);
    sc.close();
  }
}
