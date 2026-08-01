public class SecondLargest {

    public static int max(int[] arr){
        int min =Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>=min){
                min= arr[i];
            }
        }
        return min;
    }

    public static int secondMax(int[] arr){
        int maxii = max(arr);

        for (int j=0;j<arr.length;j++){
            if (arr[j] == maxii){
                arr[j] = Integer.MIN_VALUE;
            }
        }
        return max(arr);
    }
    public static void main(String[] args) {
        int[] arr ={2,4,5,6,32,7,6,9};
        System.out.println(secondMax(arr));

    }
}
