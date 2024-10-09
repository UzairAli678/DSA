public class RecursionCharacter {
    public static void ReverseCharacter(int n)
    {
        if((char)(n)>'z')
        {
            return;
        }
        else{
             ReverseCharacter(n+1);
             System.out.print((char)(n)+" ");
        }
    }
    public static void ForwardCharacter(int n)
    {
        if((char)(n)>'z')
        {
            return;
        }
        else{
            System.out.print((char)(n)+" ");
            ForwardCharacter(n+1);
             
        }
    }
    public static void main(String[] args) {
        System.out.println("Characters in reverse order ");
        ReverseCharacter(97);
        System.out.println();
        System.out.println("Characters in forward order ");
        ForwardCharacter(97);
    }
}
