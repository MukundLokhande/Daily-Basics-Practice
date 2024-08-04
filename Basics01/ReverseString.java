import java.util.Scanner;
class result
{
    public String Reverse(String Str, String str1)
    {
        int n = Str.length();

        for (int i = n-1 ; i >= 0 ; i--)
        {
            str1 = str1 + Str.charAt(i);
        }
        return str1;
    }

}
public class ReverseString 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String Str = sc.next(), str1 = "";
        result ob = new result();
        System.out.println(ob.Reverse(Str, str1));

    }
    
}
