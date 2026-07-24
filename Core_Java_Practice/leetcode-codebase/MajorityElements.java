import java.util.HashMap;
import java.util.Map;

public class MajorityElements {

    public static int findMajority(int[] arr) {
        int n= arr.length;
        /*int count =1;

        for (int left =0;left<arr.length;left++) {
            for (int right = 1; right < arr.length; right++) {

                while (arr[right] == arr[left]) {
                    count++;
                }
                if (arr.length / 2 == count) {
                    return arr[right];
                }
            }
        }
        return 0;
    }*/

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);

            if (map.get(i) > n/2){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={3,2,3};
        System.out.println(findMajority(arr));
    }
}
