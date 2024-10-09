public class StackUsingQueue {
    QueueLinkList q1;
    QueueLinkList q2;
    public void Push(int y)
    {
        q1.enqueue(y);
    }

    public int pop()
    {
        while(q1.IsEmpty())
        {
            q2.enqueue(q1.dequeue());
        }
        int k=q2.dequeue();
        while(q2.IsEmpty())
        {
            q1.enqueue(q2.dequeue());
        }
        return k;
    }
    int Top()
    {
        return q2.peek();
    }
    public static void main(String[] args) {
        StackUsingQueue stack1 = new StackUsingQueue(); 
 
        stack1.Push(1); 
        stack1.Push(2); 
        stack1.Push(3); 
        System.out.println("Top element is " +  stack1.Top()); 
        System.out.println(" Removing element "+  stack1.pop());
        System.out.println("Now Top element is " +  stack1.Top());
        System.out.println("Removing element "+  stack1.pop()); 
        System.out.println("Now Top element is " +  stack1.Top());
    }
}
