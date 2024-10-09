import java.util.Scanner;
public class Palindrome {
    public static boolean CheckPalindrome(char arr[], int Start, int end)
    {
           if(Start==end)
           {
            System.out.print ("Yes the given string is palindrome ");
            return true ;
           }
           if(end<Start)
           {
            System.out.print ("Yes the given string is palindrome ");
            return true ;
           }

           else if(arr[Start]!=arr[end])
           {
             System.out.print("Given string is not palindrome ");
             return false;
           }
           else{
            Start++;
            end--;
            return CheckPalindrome(arr, Start, end);
            
           }
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the String to check either it is palindrome or not ");
        String str=obj.next();
        char arr[]=new char[str.length()];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=str.charAt(i);
        }
      System.out.println( CheckPalindrome(arr, 0, arr.length-1));

    }
}
