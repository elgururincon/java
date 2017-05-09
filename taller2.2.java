
public class ElementosRepetidos {

    public void ElementoRepetido() {
        int  A[] = {8, 5, 8, 7, 7, 3, 5};

        for (int x = 0; x < A.length; x++) {
            System.out.print(A[x] + ",");
        }

        System.out.println("");

        int j = 0;
        int k = 0;
        char aux = 's';

        for (int i = 0; i < A.length; i++) {
            j++;
            k = j;
            boolean cambio = true;

            while (k < A.length) {

                if (A[i] == A[k]) {
                    cambio = false;
                    A[i] = aux;
                    A[k] = aux;
                    break;
                } else {

                }

                k++;
                if (cambio == true && k >= A.length) {
                    
                    System.out.println(A[i] + " Es el numero que no se repite en el arreglo, y se encuentra en el indice " + i);
                } else {

                }
            }

        }

        System.out.println("");

    }

}
