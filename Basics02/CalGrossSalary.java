import java.util.Scanner;

public class CalGrossSalary 
{
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        int basic_Salary = ob.nextInt(), GS;
        
        if(basic_Salary <= 10000)
            GS = basic_Salary + ((basic_Salary/100) * 20) + ((basic_Salary/100) * 80) ;
        else if (basic_Salary <= 20000)
            GS = basic_Salary + ((basic_Salary/100) * 25) + ((basic_Salary/100) * 90) ;
        else
            GS = basic_Salary + ((basic_Salary/100) * 30) + ((basic_Salary/100) * 95) ;

        System.out.println(GS);
        ob.close();
    }
    
}
