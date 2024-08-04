import java.security.DrbgParameters.Capability;
import java.util.Scanner;


public class StringCount 
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        String str = "Mukun daa";
        int n = str.length();
        int CapCount = 0, SmallCount = 0, space = 0, SymbolCount= 0;
        for(int i = 0; i < n; i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
            {
                CapCount++;
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                SmallCount++;
            }
            else if(ch == ' ')
            {
                space++;
            }
            else
            {
                SymbolCount++;
            }
        }
        System.out.println("Cap:"+ CapCount+ " SmallCase:"+ SmallCount+ " space: "+space + " SymbolCount:"+ SymbolCount);

    }
    
}
