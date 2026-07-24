import java.util.Arrays;

public class MergedSortedArray {

    public static void mergedArray(int[] arr1,int n, int[] arr2, int m){

        int i = n-1;
        int j = m-1;
        int pos = n+m-1;

        while (i >= 0 && j >= 0){

            if (arr1[i] >= arr2[j]){
                arr1[pos--] = arr1[i--];
            }else {
                arr1[pos--] = arr2[j--];
            }
        }

        while ( j >= 0){
            arr1[pos--] = arr2[j--];
        }

    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {3,5,6};

        mergedArray(arr1,3,arr2,3);

        System.out.println(Arrays.toString(arr1));
    }
}
