import java.util.Scanner;
class DecBinary{

     public static void DecToBinary(int s)
     {
        if(s==0)
        {
            return;
        }
        else{
            DecToBinary(s/2);
            
            System.out.print(s%2);
            
        }
     }
        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter the decimal number to convet into binary ");
            int s=obj.nextInt();
            DecToBinary(s);

        }
}