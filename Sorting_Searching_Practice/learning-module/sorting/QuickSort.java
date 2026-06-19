public class QuickSort {
    public static int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }
    public static int partition(int[] arr, int st , int end){
        int pivot = arr[st];
        int smallerThanPivot =0;

        for (int i =st+0;i<=end;i++){
            if (arr[i] < pivot ) smallerThanPivot++;
        }
        int pivIdx = smallerThanPivot + st;

        swap(arr,st,pivIdx);
        int i =st;
        int j= end;

        while (i < pivIdx && j > pivIdx){
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if (i< pivIdx && j> pivIdx ){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivIdx;
    }
    public static void quickSort(int[] arr, int st, int end){
        if (st >= end) return;

        int pi = partition(arr,st,end);

        quickSort(arr,st,pi-1);
        quickSort(arr,pi+1,end);

    }
    public static void main(String[] args) {

        int[] arr = {4,1,3,5,2};

        int n = arr.length;
        quickSort(arr,0,n-1);

        for (int val : arr){
            System.out.print(val);
        }
    }
}
