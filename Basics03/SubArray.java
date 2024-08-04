//import java.util.ArrayList;
public class SubArray 
{
    public static void main(String[] args)
    {
        
        int arr[] = {2,4,6,8,10};
        for(int i = 0; i < arr.length; i++)
        {
            for (int j = i ; j < arr.length ; j++)
            {
                for(int h = i; h < j; h++)
                {
                    System.out.print(arr[h] + ",");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
/*
 * 
 * ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < arr.length; i++)
        {
            for (int j = 0 ; j <= i ; j++)
            {
                list.add(arr[j]);
            }

            for(int h = 0; h < list.size(); h++)
                {
                    System.out.print(list.get(h)+ " ");
                }
                System.out.println(" ");
        }
 */
