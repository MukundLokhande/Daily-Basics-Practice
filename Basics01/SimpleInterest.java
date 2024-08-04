//Cal Simple Interest
import java.util.Scanner;
class Result
{

    public double SI(int Prin_amt, double Rot, double time)
    {
        double X = ((Prin_amt * Rot * time)/100);
        return X;
    }
}
public class SimpleInterest
{
    public static void main(String[] args)
    {
        int Prin_amt;
        double  Rot, time;
        Scanner ob = new Scanner(System.in);
        Result re = new Result();
        System.out.print("Enter Principle Amount, Rate Of Interest, Time: ");
        Prin_amt = ob.nextInt();
        Rot = ob.nextDouble();
        time = ob.nextDouble();

        double SimpleInterest = re.SI(Prin_amt, Rot, time);
        System.out.println(SimpleInterest);
    }
}
