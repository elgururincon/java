import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int n, i;
    	int v[] = new int[10];
    	n = input.nextInt();

    	for (i=0; i < 10; i++) {
    		System.out.println("N[" + i + "] = " + n);
    		n *= 2;
    	}
    }
}
