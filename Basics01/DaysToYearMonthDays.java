import java.util.Scanner;
class Converter
{
    public void Convert(float Days)
    {
        int years, months, weeks;
        float Remaining_Days;

        years = (int) (Days/365);
        Remaining_Days = Days % 365;

        months = (int) (Remaining_Days / 30);
        Remaining_Days = Days % 30;

        weeks = (int) (Remaining_Days / 7);
        Remaining_Days = Remaining_Days % 7;

        Days = Remaining_Days;
        System.out.println("Years:" + years + " Months:"+ months+ " Weeks:"+ weeks +" Days:"+ Days);
    }
}

class DaysToYearMonthDays
{
    public static void main(String[] args)
    {
        float Days;
        Scanner ob = new Scanner(System.in);
        Converter co = new Converter();
        System.out.println("Enter number of Days: ");
        Days = ob.nextFloat();

        co.Convert(Days);
    }
}