public class SelectionSort {

    static int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    static int[] selectionSort(int[] arr){
        int n = arr.length;

        for (int i =0;i<n-1;i++){
            int min_idx = i;

            for (int j =i+1;j<n;j++){
                if (arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
           swap(arr,i,min_idx);
        }
        return arr;
    }
    public static void main(String[] args) {

        int[] arr ={3,5,1,7,5,8,9,22,14};
        int[] sort = selectionSort(arr);
        for (int nums : sort){
            System.out.println(nums);
        }
    }
}
