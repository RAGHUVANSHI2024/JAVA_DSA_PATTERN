public class TargetElement {

    public static int findTarget(int[] arr, int idx, int target){
        // base case ...
        if (idx == arr.length){
            return -1;
        }
        //self work
        int lastIndexInRest = findTarget(arr, idx + 1, target);

        // If found later, return that
        if (lastIndexInRest != -1) {
            return lastIndexInRest;
        }

        if (arr[idx] == target){
            return idx;
        }

        return -1;
    }
    public static void main(String[] args) {

        int[] arr ={34,5,6,7,8,6,5,4,3,2,33,44,5,5,66};

        System.out.println(findTarget(arr,0,5));

    }
}