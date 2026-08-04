import java.util.Arrays;

public class ThreeSumClosest {

    static int search(int[] arr,int target){
        int n =arr.length;

        int closest = arr[0] + arr[1] + arr[2];

        Arrays.sort(arr);
        for(int i =0;i<n-2;i++){
            int left =i+1;
            int right =n-1;


            while (left< right){
                int sum =arr[i]+arr[left]+arr[right];
                if (Math.abs(sum-target)<Math.abs(sum-closest)){
                    closest =sum;
                }
                if (sum<target){
                    left++;
                }
                else if (sum > target) {
                    right--;
                }
                else {
                    return  sum;
                }
            }
        }
        return closest;

    }

    public static void main(String[] args) {
        int[] nums ={-1,2,1,4};

        System.out.println(search(nums,1));
    }
}
