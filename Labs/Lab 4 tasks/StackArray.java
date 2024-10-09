class StackArray{
    private int Array[];
    private int size;
    private int num;
    StackArray(int size)
    {
       Array=new int[size];
       num=-1;
    }
    public boolean IsEmpty()
    {
        if(num==-1)
        {
            return true;
        }
        return false;
    }
    public void push(int x)
    {
        if(num==Array.length)
        {
            System.out.println("Stack is full ");
        }
        else{
            Array[++num]=x;
            
        }
    }
      public int pop()
      {
        if(IsEmpty())
        {
            System.out.println("Stack is empty ");
            return 0;
        }
        else{
            return Array[num--];
        }
    }
        public int Top()
        {
            if(IsEmpty())
            {
                System.out.println("Stack is empty ");
                return  0;
            }
            else{
                return Array[num];
            } 
        }
        public int size()
        {
            return Array.length;
        }
        public static void main(String[] args) {
            StackArray S=new StackArray(7);
            S.push(5);
            S.push(4);
            S.push(3);
            S.push(2);
            S.push(1);
            S.push(6);
            S.push(7);
            System.out.println("Top element is: " + S.Top()); 
            System.out.println("Stack size is " + S.size()); 
             System.out.println("Remove this  element "+S.pop());
            System.out.println("Now Top element is "+S.Top());
            System.out.println("Remove this  element "+ S.pop());
            System.out.println("Now Top element is "+S.Top());
            System.out.println("Remove this  element "+ S.pop());
            System.out.println("Remove this  element "+ S.pop());
            System.out.println("Now Top element is "+S.Top());


         


        }
    }
      

    