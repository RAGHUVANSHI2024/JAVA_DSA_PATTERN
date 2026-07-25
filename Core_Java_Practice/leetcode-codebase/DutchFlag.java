public class DutchFlag {

    static int[] swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    static int[] sortColor(int[] arr){

        int low=0;
        int high=arr.length-1;
        int mid=0;

        while (mid<high){
            if (arr[mid] == 0){
                swap(arr,mid,low);
                low++;
                mid++;
            }else if (arr[mid] == 1){
                mid++;
            }
            else {
                swap(arr,mid,high);
                high--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};

        int[] ints = sortColor(arr);

        for (int i =0;i<ints.length;i++){
            System.out.println(ints[i]);
        }
    }
}
