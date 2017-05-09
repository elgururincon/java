public class Productoelementos {

    public void ProductoElementos() {
        int A[] = {1, 6, 5, 8, 2};
        int B[] = {2, 3, 1, 5, 4};

        for (int x = 0; x < A.length; x++) {

            System.out.print(A[x] + ",");
        }

        System.out.println("");

        int aux = - 1;
        int x = -1;

        for (int i = 0; i < A.length; i++) {
            int prod = 1;
            aux++;
            for (int j = 0; j < A.length; j++) {

                if (j != aux) {

                    prod = A[j] * prod;
                } else {

                }

            }

            x++;
            B[x] = prod;

        }

        for (int k = 0; k < B.length; k++) {

            System.out.print(B[k] + ",");

        }
        
        System.out.println("");

    }
    
   

}
