import java.util.Random;
import java.util.Scanner;
public class SearchIterative {
    public void Searching(int arr[], int key)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(key==arr[i])
            {
                System.out.println("Number "+key+" found at index "+i);
                return;
            }
        
         }
       
         System.out.println("No "+key+" is not found in given array ");
        
    }
    public static void main(String[] args) {
        Random R=new Random();

        Scanner obj=new Scanner(System.in);
        SearchIterative S=new SearchIterative();
        System.out.print("Enter the size of an array --> ");
        int size=obj.nextInt();
        
        int arr[]=new int [size];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=R.nextInt(10);
        }
        System.out.println("Array is here ");
        for(int j=0; j<arr.length; j++)
        {
            System.out.print(arr[j]+" ");
        }

        System.out.println();
        System.out.print("Enter the number that you want to search in array --> ");
        int key=obj.nextInt();
        long startTime = System.nanoTime();
        S.Searching(arr, key);
        long endTime   = System.nanoTime();//record the ending time 
       long totalTime = endTime - startTime;
       System.out.println("The Total consumed time is "+totalTime+" Nano Seconds ");



    }
}
