import java.io.IOException;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
            double R;
            double a;
            double pi = 3.14159;
        R = in.nextDouble();
        a = (R * pi)*R ;
        System.out.printf("A=" + "%.4f" + "\n",a);
    }
}
