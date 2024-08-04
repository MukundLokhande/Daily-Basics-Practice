import java.util.Scanner;

public class FindVowel 
{
    public static void D(char alphabet)
    {
        if((alphabet == 'a') || (alphabet == 'i') || (alphabet == 'e') || (alphabet == 'o') || (alphabet == 'u'))
        System.out.println("Vowel");
        else
        System.out.println("Consonent");
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter small case alphabet: ");
        char alphabet = ob.next().charAt(0);
        D(alphabet);
        ob.close();
    }
    
}