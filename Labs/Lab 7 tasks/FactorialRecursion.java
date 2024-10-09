import java.util.Scanner;
public class FactorialRecursion {
    public static int Factorial(int n)
    {
        if(n==1)
        {
            return 1;

        }
        else{
            return n*Factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number whose factoril you want to find ");
        int n=obj.nextInt();
        System.out.print("The factorial of given number "+n+" is ");
        long startTime = System.nanoTime();	
       System.out.println(Factorial(n));
       long endTime   = System.nanoTime();	//record the ending time 
       long totalTime = endTime - startTime;
       System.out.println("The Total consumed time is "+totalTime+" Nano Seconds ");
     

    }
}
