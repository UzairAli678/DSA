public class QueueUsingStack {
    StackLinkedList s1; 
    StackLinkedList s2; 
    public void enqueue(int x)
    {
        s1.Push(x);

    }
    public int dequeue()
    {
        while(s1.IsEmpty())
        {
            s2.Push(s1.pop());
        }
         int k=s2.pop();
         while(s2.IsEmpty())
         {
            s1.Push(s2.pop());
         }
         return k;   
    }
    public int Peek()
    {
        return s2.Top();
    }
    public static void main(String[] args) {
        QueueLinkList q = new QueueLinkList(); 
  q.enqueue(1); 
  q.enqueue(2); 
  q.enqueue(3); 
  q.enqueue(4); 
  System.out.println("Front element is "+ q.peek()); 
  System.out.println("Removing this element "+ q.dequeue()); 
  System.out.println("Now Front element is "+ q.peek()); 
  System.out.println("Removing this element "+ q.dequeue());
  System.out.println("Now Front element is "+ q.peek()); 
  System.out.println("Removing this element "+ q.dequeue()); 
  System.out.println("Now Front element is "+ q.peek()); 
  System.out.println("Removing this element "+ q.dequeue());
  //System.out.println("Removing this element "+ q.dequeue());


}
}