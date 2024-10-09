import java.util.Random;
import java.util.Scanner;
public class SearchRecursion {
    public void Searching(int arr[], int i, int key)
    {

        if(i>=arr.length)
        {
             System.out.println(key+" not found at any index ");
             return;
        }
            if(key==arr[i])
        {
            System.out.println(key+" Number found at index "+i);
            return;

        }
        else {
             i=i+1;;
             Searching(arr, i, key);
        }
    }
    public static void main(String[] args) {
        Random R=new Random();
          int a=0;
        Scanner obj=new Scanner(System.in);
        SearchRecursion S=new SearchRecursion();
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
        long startTime=System.nanoTime();
        S.Searching(arr,a,key);
        long endTime   = System.nanoTime();//record the ending time 
       long totalTime = endTime - startTime;
       System.out.println("The Total consumed time is "+totalTime+" Nano Seconds ");
    }
}
