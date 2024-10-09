public class Cycle {
   static Node1 head;
    public static void CheckCycle(int data)
    {
         Node1 N=new Node1(data);
         if(head==null)
         {
              head=N;
         }
         else{
            Node1 temp=head;
            Node1 a=null;
            while(temp.next!=null)
            {
                 a=temp;
                temp=temp.next;
            }
               temp.next=a;
               
         }
    }
         static void print()
         {  
             Node1 temp=head;
            if(head==null)
            {
                System.out.println("LL is empty");
            }
            else{
                while(temp!=null)
                {
                    System.out.println(temp.data+" ");
                    temp=temp.next;
                }
            }
         }
    public static void main(String[] args) {
        CheckCycle(1);
        CheckCycle(2);
        CheckCycle(3);
        print();
    }
}
