import java.util.Scanner;

public class NegPosZero 
{
    public static void D(int num)
    {
        if(num == 0)
        System.out.println("Zero");
        else if (num > 0)
        System.out.println("Positive number");
        else
        System.out.println("Negative Number");
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = ob.nextInt();
        D(num);
        ob.close();
    }
    
}
