public class QueuArray {
    int arr[];
    int front;
    int rear;
    int size;
    int count;
    QueuArray(int size)
    {
         arr=new int[size];
         front=0;
         rear=0;
         size=0;
         count=0;
    }
     public boolean IsEmpty()
     {
        if(size<arr.length)
        {
            return true;
        }
         return false;
     }
       public void Enque(int item)
       {
        if(IsEmpty())
        {
        arr[rear]=item;
        rear=(rear+1)%arr.length;
        count=count+1;
    } 
        else{

            System.out.println("Array is full ");
        }
       
    }

      public int Deque()
      {
          if(count==0 )
          {
            System.out.println("Array is empty ");
            return -1;
          }
          else{
            int data=arr[front];
            front=(front+1)%arr.length;
            count=count-1;
            return data;
          }
      }
      public int Top()
      {
          if(count==0 )
          {
            System.out.println("Array is empty ");
            return -1;
          }
          else{
            int data=arr[front];
            return data;
          }
      }
      public int size() 
      { 
          return count;   
      } 
      public static void main(String[] args) {
        QueuArray q=new QueuArray(7);
        q.Enque(1);
        q.Enque(2);
        q.Enque(3);
        System.out.println("Front element is: " + q.Top()); 
        q.Deque(); 
        System.out.println("Front element is: " + q.Top()); 
        System.out.println("Queue size is " + q.size()); 
        q.Deque(); 
        System.out.println("Front element is: " + q.Top());
        q.Deque(); 

        
      }
}
