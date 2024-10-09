import java.util.Scanner;

public class Quick {
    public int Partition(int arr[], int low, int high)
    {
          int pivot=arr[high];
          int i=low-1;
          for(int j=low; j<=high-1; j++)
          {
           if(arr[j]<pivot)
           {
               i++;
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }

          }
          i++;
          int temp=arr[i];
          arr[i]=arr[high];
          arr[high]=temp;

          return i;
    }
    public void QuickSort(int arr[], int low , int high)
    {
  if(low<high)
  {

    int p=Partition(arr, low, high);
    QuickSort(arr, low, p-1);
   QuickSort(arr, p+1, high);

    }
}

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Quick q=new Quick();
        System.out.print("Enter the size of an array  --> ");
        int size=obj.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<arr.length; i++)
        {
            System.out.print("Enter the element at index "+i+" --> ");
            arr[i]=obj.nextInt();
        }
         System.out.println("Original Array is here ");
         for(int i=0; i<arr.length; i++)
        {
              System.out.print(arr[i]+" ");
        }
          q.QuickSort(arr, 0, arr.length-1);
             System.out.println();
          System.out.println("Sorted Array is here ");
          for(int i=0; i<arr.length; i++)
         {
               System.out.print(arr[i]+" ");
         }

    }
}
