public class RemoveDuplicate {

    public static int removeDuplicate(int[] arr){
        int left =  1;

        for (int right =1;right<arr.length;right++){
            if (arr[right]!=arr[right-1]){
                arr[left]=arr[right];
                left++;
            }
        }
        return left;

    }

    public static void main(String[] args) {

       int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicate(nums));
    }
}
