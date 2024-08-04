class Practice
{
    public static void main(String[] args) 
    {
        int arr[] = {1,5,6,8,4,8,5,8,4,2,4,6,8};
        int n = arr.length, x = 1;
        int nw[] = new int[n];
        boolean s = true;
        nw[0] = arr[0];

        for(int i = 1; i < n; i++)
        {   s = true;
            for (int j = 0; j < i; j++)
            {   
                if (arr[i] == arr[j])
                {
                    s = false;
                }
                
            }
            if (s == true)
            {
                nw[x] = arr[i];
                x++;
            }
        }
        
        for (int p = 0 ; p < nw.length; p++)
        {
            System.out.println(nw[p]);
        }
    }
}