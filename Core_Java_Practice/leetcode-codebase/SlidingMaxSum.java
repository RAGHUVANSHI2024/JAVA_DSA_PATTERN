public class SlidingMaxSum {

    public static int maxSum(int[] arr, int k) {

        int n = arr.length;
        int sum = 0;

        if (n < k) {
            return 0;
        }
        for (int i = 0; i < k ; i++) {
            sum += arr[i];
        }
        int maxSum = sum;

        for (int i =k;i<n;i++){
            sum = sum+arr[i]-arr[i-k];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {

        int[] arr ={100,200,300,400};

        System.out.println(maxSum(arr,2));
    }
}
