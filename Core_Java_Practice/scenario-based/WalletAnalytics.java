public class WalletAnalytics {

    public static int findMinWindow(int[] arr, int target){
        int left =0;
        int windowSum =0;
        int minWindow =Integer.MAX_VALUE;

        for (int right=0;right<arr.length;right++){
            windowSum += arr[right];

            while(windowSum >= target){
                minWindow = Math.min(minWindow,right-left+1);
                windowSum -= arr[left];
                left++;
            }
        }
        return minWindow == Integer.MAX_VALUE ? 0:minWindow;
    }
    public static void main(String[] args) {
        int[] arr ={100,200,400,500,100,300};
        int minWindow = findMinWindow(arr, 1000);

        System.out.println(minWindow);
    }
}
