import java.util.Scanner;

public class MaxMin 
{
    public static void D(int num1, int num2, int num3)
    {
        if ( (num1 > num2) && (num1 > num3))
        System.out.println("Max:"+ num1);
        else if ((num2 > num1) && (num2 > num3))
        System.out.println("Max: "+ num2);
        else
        System.out.println("Max: "+num3);

        if ( (num1 < num2) && (num1 < num3))
        System.out.println("Min:"+ num1);
        else if ((num2 < num1) && (num2 < num3))
        System.out.println("Min: "+ num2);
        else
        System.out.println("Min: "+num3);
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter 3 Numbers: ");
        int num1 = ob.nextInt();
        int num2 = ob.nextInt();
        int num3 = ob.nextInt();
        D(num1, num2, num3);
        ob.close();
    }
}
