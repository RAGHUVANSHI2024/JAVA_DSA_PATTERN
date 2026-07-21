public class SquareOfSortedArray {

    public static int[] squareOfArray(int[]  arr){
        int left =0;
        int right =arr.length-1;

        int[] newArray = new int[arr.length];
        int pos =arr.length-1;

        while (left <= right){

            if (Math.abs(arr[left])>=Math.abs(arr[right])){
                newArray[pos] = arr[left]*arr[left];
                left++;
                pos--;
            }else {
                newArray[pos] = arr[right]*arr[right];
                pos--;
                right--;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {-6,-4,-2,0,1,3,5,6,7};

        int[] ints = squareOfArray(arr);

        for (int i =0;i<ints.length;i++){
            System.out.println(ints[i]);
        }
    }
}
