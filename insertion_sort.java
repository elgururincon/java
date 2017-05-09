public class InsertionSort {

    public void InsetionSort() {
        int Array[] = {4, 6, 2, 7, 32, 1, 8, 2, 8, 12, 78};
        int Auxiliar;
        int contador1, contador2;

        for (int x = 0; x < Array.length; x++) {
            System.out.print(Array[x] + ",");
        }
        System.out.println("");
        for (contador1 = 1; contador1 < Array.length; contador1++) {

            Auxiliar = Array[contador1];
            for (contador2 = contador1 - 1; contador2 >= 0 && Array[contador2] > Auxiliar; contador2--) {
                Array[contador2 + 1] = Array[contador2];
                Array[contador2] = Auxiliar;
            }
        }
        for (int j = 0; j < Array.length; j++ ) {
            System.out.print(Array[j] + ",");
        }
        
        System.out.println("");
    }

}
