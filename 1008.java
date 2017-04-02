import java.util.Scanner;
import java.util.Locale;

public class Main 
{
  
    public static void main(String args[]) 
        {

	        Locale.setDefault(Locale.US);
	        Scanner ler = new Scanner(System.in);
	        int numero, horas;
	        double valor, salario;

	        numero = ler.nextInt();
	        horas = ler.nextInt();
	        valor = ler.nextDouble();
	        salario = (horas * valor);
  
	        System.out.println("NUMBER = " + numero);
	        System.out.printf("SALARY = U$ %.2f\n", salario);

        }
  
}
