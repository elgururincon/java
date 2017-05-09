import java.util.Scanner;

public class Busqueda_Lineal {

    public int BusquedaSecuancial(int Array[]) {

        Scanner Sc = new Scanner(System.in);
        System.out.print("Ingrese el numero que desea buscar: ");
        int x = Sc.nextInt();
        int posicion = -1;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == x) {
                posicion = i;
                System.out.println("El numero " + x + " esta en el arreglo y se encuntra en la posicion " + posicion);
                break;
            }
        }
        return posicion;
    }

}
