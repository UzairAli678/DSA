public class StackLinkedList {
    Node top;
    public boolean IsEmpty()
    {
        if(top==null)
        {
           return true;
        }
        return false;
    }
    public void Push(int x)
    {
         Node N=new Node(x);
        if(top==null){
           top=N;
        }
        else{
            N.next=top;
            top=N;
        }
    }
    public int pop()
    {
        if(IsEmpty()){
            System.out.println("Stack is empty ");
            return 0;
        }
        else{
            int K=top.data;
            top=top.next;
            return K;
        }
    }
    public int Top()
    {
        if(IsEmpty()){
            System.out.println("Stack is empty ");
            return 0;
        }
        else{
            int K=top.data;
            return K;
        }
    }
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList(); 
 
        stack.Push(1); 
        stack.Push(2); 
        stack.Push(3); 
        System.out.println("Top element is " +  stack.Top()); 
        stack.pop(); 
        System.out.println("Removing element "+  stack.pop());
        System.out.println("Now Top element is " +  stack.Top());
        System.out.println("Removing element "+  stack.pop()); 
       // System.out.println("Now Top element is " +  stack.Top());
    }
}
