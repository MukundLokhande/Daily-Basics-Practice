import java.util.Scanner;

public class IdentifyChar
{
    public static void D(char character)
    {
        if( ((character >= 'a') && (character <= 'z') ) || ((character >= 'A') && (character <= 'Z') ) )
        System.out.println("Alphabet");
        else if ((character >= 48) && (character <= 57))
        System.out.println("Number");
        else
        System.out.println("Special Symbol");
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter character: ");
        char character = ob.next().charAt(0);
        D(character);
        ob.close();
    }
    
}
