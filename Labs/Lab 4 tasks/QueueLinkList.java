public class QueueLinkList {
    Node head;
    Node tail;
    public boolean IsEmpty()
    {
        if(head==null)
        {
            return true;
        }
        return false;
    }
    public void enqueue(int data)
    {     Node n=new Node(data);
        if(IsEmpty())
        {
            head=tail=n;

        }
        else{
            tail.next=n;
            tail=n;
        }
    }
    public int dequeue()
    {
        if(IsEmpty())
        {
            System.out.println("Linked list is empty ");
            return 0;
        }
        else{
          int  k=head.data;
          head=head.next;
          return k;


        }
    }
        public int peek()
        {
            return head.data;
            //return k;
        }

    
    public static void main(String[] args) {
              QueueLinkList q3 = new QueueLinkList(); 
        q3.enqueue(1); 
        q3.enqueue(2); 
        q3.enqueue(3); 
        q3.enqueue(4); 
        System.out.println("Front element is "+ q3.peek()); 
        System.out.println("Removing this element "+ q3.dequeue()); 
        System.out.println("Now Front element is "+ q3.peek()); 
        System.out.println("Removing this element "+ q3.dequeue());
        System.out.println("Now Front element is "+ q3.peek()); 
        System.out.println("Removing this element "+ q3.dequeue()); 
        System.out.println("Now Front element is "+ q3.peek()); 
        System.out.println("Removing this element "+ q3.dequeue());
        System.out.println("Removing this element "+ q3.dequeue());


        
    }
}
