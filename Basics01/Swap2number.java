import java.util.Scanner;
class Result
{
    public void swapWithExtraVar(int num1, int num2)
    {
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("number1: "+ num1+ " number2: " + num2);
    }
    public void swapWithNoExtraVar(int num1, int num2)
    {
        
        num1 = num1 + num2;
        num2 = num1-num2;
        num1 = num1 -num2;
        System.out.println("number1: "+ num1+ " number2: " + num2);
    }

}
public class Swap2number 
{
    public static void main(String[] args) 
    {
        int num1, num2;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 2 Numbers: ");
        num1 = ob.nextInt();
        num2 = ob.nextInt();
        System.out.println("Number1: "+ num1 + " Number2: "+ num2);

        Result re = new Result();
        re.swapWithExtraVar(num1, num2);
        re.swapWithNoExtraVar(num1, num2);


    } 
}
