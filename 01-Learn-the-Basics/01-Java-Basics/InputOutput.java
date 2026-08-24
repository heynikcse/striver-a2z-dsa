import java.util.Scanner ;

public class InputOutput {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number: ");
    int n = sc.nextInt();

    System.out.println("Input number is " + n);
    sc.close();
  }
}
