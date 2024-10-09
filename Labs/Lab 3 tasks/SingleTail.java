public class SingleTail {
    static Node1 head;
    static Node1 tail;
    static void AddFront(int data)
    {
        Node1 n=new Node1(data);
        if(head==null)
        {
            head=tail=n;
        }
        else{
             n.next=head;
             head=n;

        }

    }
    static void AddBack(int data)
    {
        Node1 n=new Node1(data);
        if(head==null)
        {
            head=tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
    }
    static void RemoveFront()
    {
        if(head==null&& tail==null)
        {
            System.out.println("LL is empty");
        }
        else{
            head=head.next;
        }
    }
    static void RemoveBack()
    {
        if(head==null&& tail==null)
        {
            System.out.println("LL is empty");
        }
        else{
            Node1 temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;

        }
    }
           
       static void print(){
        
        if(head==null)
        {
            System.out.println("LL is empty ");
        }
        else{
            Node1 temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
       }
    public static void main(String[] args) {
        AddFront(2);
        AddFront(1);
        AddBack(3);
        AddBack(4);
        AddBack(5);
        System.out.print("Linkedlist is here ");
        print();
        System.out.println();
        System.out.print("After removing front ");
        RemoveFront();
        print();
        System.out.println();
        System.out.print("After removing from front and back ");
        RemoveBack();
        print();
    }


}
