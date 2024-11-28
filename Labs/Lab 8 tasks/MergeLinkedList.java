import java.util.Scanner;
import java.util.LinkedList;
public class MergeLinkedList {
    
      public Node addBack(int data, Node head)
      {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            return head;
        }
        else{

            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }
        return head;
      }
    
      public void Print(Node head)
      {
        if(head==null)
        {
            System.out.println("Linked list is empty ");
            
        }
        else{
            Node temp=head;
            while(temp!=null)
            {
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        MergeLinkedList L1=new MergeLinkedList();
        MergeLinkedList L2=new MergeLinkedList();
        Node head1=null;
        head1=L1.addBack(1, head1);
        head1=L1.addBack(2, head1);
        head1=L1.addBack(3, head1);
        head1=L1.addBack(4, head1);
        Node head2=null;
        head2=L2.addBack(5, head2);
        head2=L2.addBack(6, head2);
        head2=L2.addBack(7, head2);
        head2=L2.addBack(8, head2);
        L1.Print(head1);
        L2.Print(head2);


    



    }
}
