import java.util.Arrays;

class The$GiftCard{

    public static int[] findGiftCardPair(int[] arr , int target){
        int left =0;
        int right = arr.length-1;

        while (left<right){
            int sum =-1;

            sum = arr[left]+arr[right];

            if (sum == target){
                return new int[]{arr[left],arr[right]};
            } else if (sum < target) {
                left++;

            }else {
                right--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        int[] prices = {10, 20, 35, 50, 65, 80};
        int targetSum = 100;

        int[] result = findGiftCardPair(prices, targetSum);
        System.out.println("Items to buy: " + Arrays.toString(result));
    }
}