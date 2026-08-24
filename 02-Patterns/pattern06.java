import java.util.Scanner;

public class pattern06 {
  static void print6(int n) {
    for (int i=n; i>0; i--) {
      for (int j=1; j <= i ; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value n: ");
    n = sc.nextInt();
    print6(n);
    sc.close();
  }
}
