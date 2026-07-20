public class ContainerWithMostWater {

   /* public static int mostWater(int[] arr){
        int n = arr.length-1;
        int maxWater = 0;

        for (int i =0;i<=n;i++){
            for (int j = i+1;j<=n;j++){
                int width = j-i;
                int height = Math.min(arr[i],arr[j]);
                maxWater = Math.max(maxWater,width*height);
            }
        }
        return maxWater;
    }*/

    public static int mostWater(int[] arr){
        int left = 0;
        int n = arr.length-1;
        int right = n;
        int maxWater = 0;


        while (left <= right) {
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            maxWater = Math.max(maxWater, height * width);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int[] arr ={1,8};

        System.out.println(mostWater(arr));

    }
}
