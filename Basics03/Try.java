public class Try 
{
    public static void main(String[] args)
    {
        String arr[] = {"1234", "2738"};
        String str = arr[0];
        int num = Integer.parseInt( String.valueOf(str.charAt(1))) * 10 + Integer.parseInt( String.valueOf(str.charAt(2)));
        System.out.println(num);
            

    }
    
}
