import java.util.Scanner;
class RecursionAscending{
    public void Ascending(int n)
    {
           if(n==0)
           {
            return;
           }
           else{
            
            
              Ascending(n-1);
              System.out.print(n+" ");
             
           }

    }
    public void Descending(int n)
    {
           if(n==0)
           {
            return;
           }
           else{
            
            System.out.print(n+" ");
              Descending(n-1);
              
             
           }

    }
    
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       RecursionAscending A=new RecursionAscending();
       System.out.println("Enter the value till the numbers print "); 
       int n=obj.nextInt();
       System.out.println("Numbers in Ascending order is ");
       A.Ascending(n);
       System.out.println();
       System.out.println("Numbers in Descending order is");
       A.Descending(n);
       
    }
}