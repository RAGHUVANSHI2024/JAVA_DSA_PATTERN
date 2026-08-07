import java.util.ArrayList;
import java.util.List;

public class ReturnIndexes {

    public static List<Integer> findIndex(int[] arr ,int idx, int target){
        List<Integer> list =new ArrayList<>();
        if (idx == arr.length){
            return list;
        }
        if (arr[idx] == target){
            list.add(idx);
        }

        List<Integer> list1 = findIndex(arr,idx+1,target);
        list.addAll(list1);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,7,5,7,66,4};

        System.out.println(findIndex(arr,0,7));

    }
}
