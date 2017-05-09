public class DistanciaMinima {

    public void DistanciaMinima() {
        int Array[] = {1, 14, 120, 95, 8};

        int d;
        int j = 0;

        for (int i = 0; i < Array.length; i++)
        {
           
           
           j++;
           int k = j;
            
            while(k < Array.length)
            {
               
               if(Array[i]!= Array[k])    
               {
                   d = Array[i] - Array[k];
                   System.out.print(d+",");
               }
               else
               {
                   
               }
               k ++; 
               
            }
            
            
            System.out.println(" ");
        }
    }

}
