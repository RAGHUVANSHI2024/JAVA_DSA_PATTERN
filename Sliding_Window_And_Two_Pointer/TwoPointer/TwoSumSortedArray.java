public class TwoSumSortedArray {

    public static int[] findSum(int[] arr,int target){
        int i =0;
        int j =arr.length-1;

        while (i < j){
            int sum = arr[i]+arr[j];
            if (sum > target){
                j--;
            } else if (sum < target) {
                i++;
            }
            else {
                return new int[]{i,j};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,7,15};

        int[] sum = findSum(arr, 9);

        for (int j =0;j<sum.length;j++){
            System.out.println(sum[j]);
        }


    }
}
