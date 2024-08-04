public class Result 
{
    public int length;
    public int[] uniqueArray;

    public Result(int length, int[] uniqueArray) {
        this.length = length;
        this.uniqueArray = uniqueArray;
    }

    public static Result removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return new Result(0, new int[0]);

        int k = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        int[] uniqueArray = new int[k];
        for (int i = 0; i < k; i++) {
            uniqueArray[i] = nums[i];
        }

        return new Result(k, uniqueArray);
    }
public static void main(String[] args) 
{
    int[] nums = {1, 1, 2, 2, 3, 3, 4};
    Result result = removeDuplicates(nums);
    System.out.println("Length: " + result.length);
    System.out.print("Unique Array: ");
    for (int num : result.uniqueArray) 
    {
        System.out.print(num + " ");
    }
}
}
