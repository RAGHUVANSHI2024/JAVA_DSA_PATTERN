public class RunningSumOf1DArray {

    public static int[] runningSum(int[] nums) {
        int sum = 0;

        for (int i =1;i<nums.length;i++){
            sum = nums[i]+nums[i-1];
            nums[i] = sum;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int[] ints = runningSum(arr);

        for (int i =0;i<ints.length;i++){
            System.out.println(ints[i]);
        }

    }
}
