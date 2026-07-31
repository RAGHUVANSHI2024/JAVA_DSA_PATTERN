public class TrappingRainWater {

    static int waterStore(int[] arr){
        int n = arr.length-1;
        int left =0;
        int right = n;

        int leftMax =0;
        int rightMax =0;
        int sum=0;

        while (left<right){

            leftMax = Math.max(leftMax,arr[left]);
            rightMax = Math.max(rightMax,arr[right]);


            if (leftMax < rightMax){
                sum =sum+leftMax-arr[left++];
            }else {
                sum = sum + rightMax-arr[right--];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(waterStore(arr));
    }
}
