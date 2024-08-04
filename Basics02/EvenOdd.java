import java.util.Scanner;
public class EvenOdd 
{
    public static void D(int num)
        {
            if((num % 2) == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int num = ob.nextInt();
        D(num);
        ob.close();
    }
}
