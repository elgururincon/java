import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1010 {
    public static void main(String[] args) {

  
        Scanner sc = new Scanner(System.in);

        int prod1_codigo = sc.nextInt();
        int prod1_unidades = sc.nextInt();
        float prod1_preco = sc.nextFloat();

        float prod1 = prod1_unidades * prod1_preco;

        int prod2_codigo = sc.nextInt();
        int prod2_unidades = sc.nextInt();
        float prod2_preco = sc.nextFloat();

        float prod2 = prod2_unidades * prod2_preco;
        DecimalFormat df = new DecimalFormat("####.00");

        float prodResultado = prod1 + prod2;

        System.out.println("VALOR A PAGAR:" + " " + "R$" + " " + df.format(prodResultado));
    }
}
