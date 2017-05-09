
public class DiferenciaMayor {

    public void DiferenciaMayor() {

        int Array[] = {12, 34, 102, 49, 78};

        int d;
        int j = 0;

        for (int i = 0; i < Array.length; i++) {
            System.out.println(" ");
            j++;
            int k = j;

            while (k < Array.length) {

                if (Array[k] > Array[j]) {
                    d = Array[i] - Array[k];
                    System.out.print(d + ",");
                }

                k++;

            }

        }
        
        System.out.println("");
    }

}
