public class RecursiveFabonnaci {
    
    public static int Fabonnaci(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else{
            return Fabonnaci(n-1)+Fabonnaci(n-2);
        }
    }
    public static void main(String[] args) {
        
        long startTime=System.nanoTime();
        System.out.println(Fabonnaci(5));
        long endTime=System.nanoTime();
        long totalTime=endTime-startTime;
        System.out.println("The total time consumed is "+totalTime);
    }
}
