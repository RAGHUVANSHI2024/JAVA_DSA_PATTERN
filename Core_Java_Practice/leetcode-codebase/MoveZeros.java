public class MoveZeros {

    static int[] moveZeros(int[] arr){
        int left =0;

        for (int right=0;right<arr.length;right++) {
            if (arr[right] != 0){
                arr[left]=arr[right];
                left++;
            }
        }
        while (left<arr.length){
            arr[left]=0;
            left++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= {0,1,0,2,4,12};

        int[] ints = moveZeros(arr);

        for (int p=0;p<ints.length;p++){
            System.out.println(ints[p]);
        }
    }
}

