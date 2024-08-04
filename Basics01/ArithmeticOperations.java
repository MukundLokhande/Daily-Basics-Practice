import java.util.Scanner;

class Operations
{
    int number1 , number2 ;
    int add, sub,div, multiply,mod;
    public void ope()
    {
        
        add = number1 + number2;
        sub = number1-number2;
        div = number1/number2;
        multiply = number1*number2;
        mod = number1%number2;

        System.out.println("add "+add);
        System.out.println("sub "+sub);
        System.out.println("div "+ div);
        System.out.println("multiply " + multiply);
        System.out.println("mod " + mod);
        
    }
}
public class ArithmeticOperations
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
    
        Operations op = new Operations();
        System.out.println("Enter 2 Integer values: ");
        op.number1 = ob.nextInt();
        op.number2 = ob.nextInt();
        op.ope();
    }
    
}
