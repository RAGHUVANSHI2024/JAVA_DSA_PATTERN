public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        int n = arr.length;

        for (int i=0;i<n-1;i++){
            int j =i;
            while (j>0 && arr[j-1] > arr[j]){
                SelectionSort.swap(arr,j,j-1);
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr={4,7,2,4,6,8,9,4,10};
        int[] sort = insertionSort(arr);
        for (int nums : sort) {
            System.out.println(nums);
        }
    }
}
