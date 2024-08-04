public class PossibleArrayPair 
{     
    public static void main(String[] args) 
    {
            int arr[] = {1, 2, 4, 5, 6, 7, 8, 9, 10};
            int n = arr.length;
            for (int i = 0, x = i + 1; i < n - 1 && x < n; i++, x++) {
                System.out.println("( " + arr[i] + ", " + arr[x] + " )");
            }
    }
}
