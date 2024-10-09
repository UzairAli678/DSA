import java.util.Scanner;
public class MergeSortRecursion {
    public void Split(int arr[], int left, int right)
    {
        if(left<right)
        {
            int mid=(left+right)/2;
            Split(arr, left, mid);
            Split(arr, mid+1, right);
            Merge(arr, left, mid, right);
        }   
    }
    public void Merge(int arr[], int left, int mid, int right)
    {
        int n1=mid-left+1;
        int n2=right-mid;
        int left1[]=new int[n1];
        int right1[]=new int [n2];
        for(int i=0; i<n1; i++)
        {
            left1[i]=arr[left+i];
        }  
         for(int j=0; j<n2; j++)
        {
            right1[j]=arr[mid+1+j];
        }
        int i=0, j=0, k=left;
        while(i<n1 && j<n2)
        {
            if(left1[i]<=right1[j])
            {
                arr[k]=left1[i];
                i++;
            }
            else{
               arr[k]=right1[j];
               j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]=left1[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=right1[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        MergeSortRecursion  M=new MergeSortRecursion();
        System.out.print("Enter the size of an Array --> ");
        int size=obj.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<arr.length; i++)
        {
            System.out.print("Enter the element at index "+i+" ");
             arr[i]=obj.nextInt();
        }
        System.out.println("Unsorted Array is here ");
        for(int j=0; j<arr.length; j++)
        {
           System.out.print(arr[j]+" ");
        }
          System.out.println();
        M.Split(arr, 0, arr.length-1);
        System.out.println("Sorted array is here ");
        for(int j=0; j<arr.length; j++)
        {
           System.out.print(arr[j]+" ");
        }      
    }
}
