public class DoublyTail {
    public static Node head;
    public static Node tail;
    public static void AddFront (String name)
    {
        Node n=new Node(name);
        if(head==null)
        {
            head=tail=n;
        }
        else{
               n.next=head;
               head.prev=n;
               head=n;      

        }

    }
    public static void AddBack(String name)
    {
        Node n=new Node(name);
        if(head==null)
        {
            head=tail=n;
        }
        else{
            tail.next=n;
            n.prev=tail;
            tail=n;
        }

       
    }
         static void RemoveFront()
    {
        if(head==null && tail==null)
        {
            System.out.println("LL is empty");
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }
    static void RemoveBack()
    {
        if(head==null&& tail==null)
        {
            System.out.println("LL is empty");
        }
        else{
            Node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
               temp.next=null;
               tail.prev=null;
               tail=temp;

        }

    }
    static void print(){
        
        if(head==null)
        {
            System.out.println("LL is empty ");
        }
        else{
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.name+" ");
                temp=temp.next;
            }
        }
       }
       public static void main(String[] args) {
        AddFront("uzair ");
        AddFront("Hello");
        AddBack("Ali ");
        AddBack("Memon ");
        System.out.print("Original doubly linked list is here --> ");
        print();
        System.out.println();
        System.out.print("After removing front --> ");
        RemoveFront();
        print();
        System.out.println();
        System.out.print("After removing front and back --> ");
        RemoveBack();
        print();
       }
}