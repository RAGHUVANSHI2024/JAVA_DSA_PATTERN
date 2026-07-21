import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();

        for (int num : nums){
            set.add(num);
        }

        int maxLength =0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                maxLength = Math.max(maxLength,count);
            }
        }
        return maxLength;

    }

    public static void main(String[] args) {

        int[] arr = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));


    }
}
