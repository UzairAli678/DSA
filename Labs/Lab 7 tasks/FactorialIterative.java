import java.util.Scanner;
public class FactorialIterative {
    public static void Factorial(int n)
    {
        int fact=1;
        for(int i=1; i<=n; i++)
        {
            fact*=i;
        }
        System.out.println("Factorial of number "+n+" is here "+fact);
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number whose factoril you want to find ");
        int n=obj.nextInt();
        long startTime = System.nanoTime();	//record the starting time run algorithm 
        Factorial(n);
        long endTime   = System.nanoTime();	//record the ending time 
      long totalTime = endTime - startTime;
      System.out.println("The Total consumed time is "+totalTime+" Nano Seconds ");
    }
}
