import java.util.Scanner;
import java.util.Stack;
public class UndoRedo1 {
    
    public static void main(String[] args) {
        Stack<String> S1=new Stack<>();
        Stack<String> S2=new Stack<>();
        Stack<String> S3=new Stack<>();
        Scanner obj=new Scanner(System.in);
        System.out.println("1 for insert");
        System.out.println("2 for Undo ");
        System.out.println("3 for Redo ");
        System.out.println("4 for Displaying Stack ");
        System.out.print("Enter your choice --> ");
        int ch=obj.nextInt();
        while(ch>=1 && ch<=4)
        {
           if(ch==1)
           {
            System.out.println("Enter the String that you want to insert in stack ");
            String data=obj.next();
            S1.push(data);
           
           }
          else if(ch==2)
           {
               S2.push(S1.pop());
               System.out.println("Undo Successfull");
           }
          else if(ch==3)
          {
            S1.push(S2.pop());
            System.out.println("Redo successfull ");
          }
          else if(ch==4)
          {
            
            while(!S1.empty())
            {  
               System.out.print(S1.peek()+" ");
               S3.push(S1.pop());
                
            }
               while(!S3.isEmpty())
            {
               S1.push(S3.pop());
            }

            if(S1.empty())
            {
                System.out.println("Stack is empty ");
            }

          }

          System.out.print("Enter your choice --> ");
           ch=obj.nextInt();
        }

    }
}
