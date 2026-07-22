import java.util.HashMap;
import java.util.Map;

public class ContainDuplicate {

    public static boolean duplicate(int[] arr){


       /* for (int i =0;i<arr.length;i++){
        for (int j =i+1;j<arr.length;j++){

            if (arr[j]==arr[i]) {
                return true;
            }
            }
        }
        return false;*/

        Map<Integer, Integer> map = new HashMap<>();

        for (int i =0;i<arr.length;i++){

            if (map.containsKey(arr[i])){

                return true;
            }
            map.put(arr[i],i);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,1};

        System.out.println(duplicate(nums));

    }
}
