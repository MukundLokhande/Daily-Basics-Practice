class ReverseArray
{
    public static void main(String[] args)
    {
        
        int arr[] = {1,2,4,5,6,7,7,5,4,4};
        int Temp = 0, n = arr.length;
        for(int i = 0; i < (n/2) ; i++)
        {
            Temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = Temp;
        } 
        
        for( int var : arr)
            System.out.print(var + " ");
    }
}