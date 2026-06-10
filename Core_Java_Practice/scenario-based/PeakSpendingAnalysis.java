public class PeakSpendingAnalysis {

    public static int findPeakSpending(int[] arr, int k){
        int maxSpending =0;
        int startWindow =0;
        int windowSum =0;

        for (int i=0;i<arr.length;i++){
            windowSum += arr[i];

            if (i >= k-1){
                maxSpending = Math.max(windowSum,maxSpending);

                windowSum = windowSum-arr[startWindow];

                startWindow++;
            }
        }

        return maxSpending;
    }
    public static void main(String[] args) {

        int[] arr = {100, 200, 400, 100, 300, 500, 100};

        int peakSpending = findPeakSpending(arr, 3);

        System.out.println(peakSpending);
    }
}
