import java.io.IOException;
import java.util.Scanner; 

public class Main
{
 public static void main(String[] args) throws IOException {
    
     Double A, B, med;
     Scanner input = new Scanner(System.in);
     A = input.nextDouble();
     B = input.nextDouble();
     
     
        med = (((A * 3.5) + (B * 7.5)) / (3.5 + 7.5));
        String media = String.format("MEDIA = %,.5f", med);
        System.out.print(media +"\n");
    }
 
}
