public class BubbleSort {

    static int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

     static int[] sort1(int[] arr){
        int n =arr.length;


        for (int i =n-1;i>0;i--){

            int noSwap =0;
            for (int j=0;j<=i-1;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    noSwap =1;
                }
            }

            if (noSwap == 0){
                break;
            }
        }
        return arr;
     }
    static int[] sort2(int[] arr){
        int n =arr.length;


        for (int i =0;i<n;i++){

            int noSwap =0;
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    noSwap =1;
                }
            }

            if (noSwap == 0){
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {14,46,24,52,20,9};
        int[] check = sort2(arr);

        for (int nums : check){
            System.out.println(nums);
        }
    }
}
