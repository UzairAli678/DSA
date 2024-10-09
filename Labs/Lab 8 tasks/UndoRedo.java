import java.util.Scanner;
public class UndoRedo {
    Node head;
    public  void insert(String data)
    {
          Node n=new Node(data);
        if(head==null)
        {
           head=n;
        }
        else{
            n.next=head;
            head=n;
        }

    }
    public String Undo()
    {
        if(head==null)
        {
            System.out.println("Stack is empty ");
            return " ";
        }
        else{
            String k=head.data;
            head=head.next;
            return k;
        }
    }
    public void DisplayStack()
    {
        if(head==null)
        {
            System.out.println("stack is empty ");
        }
        else{
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        UndoRedo U=new UndoRedo();
        UndoRedo U1=new UndoRedo();
        System.out.println("1 for insert,  2 for undo  3 for redo, 4 display stack , greater than 4 is cancled " );
        System.out.print("Enter your choice --> ");
        int ch=obj.nextInt();
        while(ch>=1 && ch<=4)
        {

           if(ch==1)
        {
            System.out.println("Kindly enter string ");
            String d=obj.next();
            U.insert(d);
        
            
        }
            else if(ch==2)
        {  
             U1.insert(U.Undo());
             System.out.println(" Undo successfull ");      
            
        } 
           else if(ch==3)
        {     if(U.head==null)
            {
                System.out.println("Redo Unsuccessfull ");
            } 
            else{

             U.insert(U1.Undo());
             System.out.println("Redo successfull ");
            }
    }
        else if(ch==4)
        { 
            U.DisplayStack();
            System.out.println();

        } 
        
           System.out.print ("Enter your choice --> ");
           ch=obj.nextInt();
       
    }
   
    }
}

