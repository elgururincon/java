import java.io.IOException;
import java.util.Scanner;
 
class Main 
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    int SOMA = n+m;
    System.out.println("SOMA = "+Integer.valueOf(SOMA));
  }
}
