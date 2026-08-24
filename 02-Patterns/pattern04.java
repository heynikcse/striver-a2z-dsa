import java.util.Scanner;

public class pattern04 {

  static void print4(int n) {
    for (int i=1; i <= n; i++) {
      for (int j=1; j <= i ; j++){
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value n: ");
    n = sc.nextInt();
    print4(n);
    sc.close();
  }
  
}