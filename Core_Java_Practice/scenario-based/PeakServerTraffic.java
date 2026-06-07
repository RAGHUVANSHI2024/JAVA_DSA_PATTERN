public class PeakServerTraffic {

    public  static int findPeakTraffic(int[] arr,int k){
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
    public static int findPeakTraffic2(int[] arr , int k){
        int sum =0;
        int startWind =0;
        int maxTraffic =0;

        for (int i =0;i<arr.length;i++){
            sum += arr[i];

            if (i >= k-1){

                maxTraffic = Math.max(maxTraffic,sum);

                sum = sum-arr[startWind];

                startWind++;
            }
        }
        return maxTraffic;
    }
    public static void main(String[] args) {

        int[] traffic = {10, 50, 30, 20, 60, 40, 10};
        int windowSize = 3;

        int peak = findPeakTraffic2(traffic, windowSize);
        System.out.println("Peak 3-hour traffic: " + peak);
    }
}
