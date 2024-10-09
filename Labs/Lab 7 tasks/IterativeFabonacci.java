public class IterativeFabonacci {
    public static void Fabonnaci(int n)
    {
        int term1=0;
        int term2=1;
        int nextTerm=0;
        System.out.print(term1+" ");
        System.out.print(term2+" ");
        for(int i=0; i<n; i++)
        {  
            nextTerm=term1+term2;
            if(nextTerm<=n)
           {  
            System.out.print(nextTerm+" ");
            term1=term2;
            term2=nextTerm;
            
           }

        }
    }
    public static void main(String[] args) {
        System.out.println("The fabonnaci series through iterative way ");
        long startTime = System.nanoTime();	//record the starting time run algorithm 
        Fabonnaci(60);
       long endTime   = System.nanoTime();	//record the ending time 
       long totalTime = endTime - startTime;
       System.out.println();
       System.out.println("The Total consumed time is "+totalTime+" Nano Seconds ");

    }
}
