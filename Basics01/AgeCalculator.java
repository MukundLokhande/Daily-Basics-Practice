import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class AgeCalculator 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dobStr = scanner.nextLine();
        scanner.close();

        // Parsing the date of birth string to LocalDate object
        LocalDate dob = LocalDate.parse(dobStr);

        // Getting the current date
        LocalDate currentDate = LocalDate.now();

        // Calculating the period between dob and current date
        Period period = Period.between(dob, currentDate);

        // Calculating the total days lived
        long daysLived = ChronoUnit.DAYS.between(dob, currentDate);

        // Calculating years, months, weeks, and remaining days
        int years = period.getYears();
        int months = period.getMonths();
        long weeks = (daysLived -((years * 365) + (months * 30))) / 7;
        long remainingDays = daysLived % 7;

        // Adjusting months, weeks, and days
        if (remainingDays >= 5) {
            weeks++;
            remainingDays = 0;
        }

        if (months >= 12) {
            years++;
            months = 0;
        }

        // Outputting the results
        System.out.println("You have lived:");
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + remainingDays);
    }
    
}


