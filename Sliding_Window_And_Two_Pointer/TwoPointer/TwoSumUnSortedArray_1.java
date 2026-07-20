import java.util.HashMap;
import java.util.Map;

public class TwoSumUnSortedArray_1 {

    public static int[] findSum(int[] arr,int target){
        int n = arr.length-1;
        Map<Integer,Integer> map = new HashMap<>();

        for (int i =0;i<=n;i++){
            int check = target-arr[i];
            if (map.containsKey(check)){
                return new int[]{map.get(check),i};
            }else {
                map.put(arr[i],i);
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
