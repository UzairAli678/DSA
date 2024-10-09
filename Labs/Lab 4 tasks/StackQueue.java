public class StackQueue {
    QueueUsingLinkedList q1;
    QueueUsingLinkedList q2;
    int k;
    int size=0;
    public void push(int x){
        q1.enqueue(x); 
        size++;
    }
    public int pop(){
        for(int i=1; i<size; i++)
        {
           q2.enqueue(q1.dequeue());
        }
         k=q1.dequeue();
        size--;
        int j;
        for(j=1; j<=size; j++)
        {
            q1.enqueue(q2.dequeue());
        }
        return k;

    }
      public int top(){
        int k=0;
        for(int i=1; i<=size; i++)
        {
            
            if (i==size)
           {
              k=q1.dequeue();
              q2.enqueue(k);
           }
           else{
            q2.enqueue(q1.dequeue());
           }
           
        }

        QueueUsingLinkedList temp=q1;
             q1=q2;
             q2=temp; 
             if(k==0)
             {
                System.out.println(" Stack is empty ");
             } 
            return k;
            
      }
  
    public static void main(String[] args) {
        StackQueue stack=new StackQueue();
         stack.push(1);
        stack.push(2);
        stack.push(3); 
         System.out.println("Top element is " + stack.top());
        System.out.println("Removing : "+stack.pop() );
        System.out.println("Top element is " + stack.top());
        System.out.println("Removing : "+stack.pop() );
        System.out.println("Top element is " + stack.top());
        System.out.println("Removing : "+stack.pop() );
        stack.push(8);
        System.out.println("Top element is " + stack.top());
        System.out.println("Removing : "+stack.pop());
}
}
