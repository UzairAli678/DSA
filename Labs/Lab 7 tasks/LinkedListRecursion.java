public class LinkedListRecursion {
   
        static Node head;
        public static void AddBack(int data)
        {
           Node n=new Node(data);
            if(head==null)
            {
                head=n;
            }
            else{
            Node temp=head;
        
        while(temp.next!=null)    
        {
               temp=temp.next;
        }
             temp.next=n;
    }
            
            }

                 public static void RecursionPrint(Node temp)
            {
                
                if(temp==null)
                {
                    return;
                }
                else{
                    
                
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                    RecursionPrint(temp);
                }
            }
     
    public static void main(String[] args) {
        AddBack(1);
        AddBack(2);
        AddBack(3);
        AddBack(4);
        AddBack(5);
        long startTime = System.nanoTime();
        AddBack(6);
        long endTime   = System.nanoTime();	//record the ending time 
        long totalTime = endTime - startTime;
        System.out.println("The Total consumed time is "+totalTime+" Nano Seconds ");
        RecursionPrint(head);
    
    }
    } 
    

