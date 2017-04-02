import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
         Double A, B, C, med;
         Scanner input = new Scanner(System.in);
         
         A = input.nextDouble();
         B = input.nextDouble();
         C = input.nextDouble();
         
         med = (((A * 2.0)+(B* 3.0)+(C* 5.0))/(2.0 +3.0 +5.0));
         String media = String.format("MEDIA = %,.1f", med);
         System.out.print(media +"\n");
 
    }
 
}
