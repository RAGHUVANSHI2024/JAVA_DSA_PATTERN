public class BuyAndSellStock {

    public static int bestTime(int[] arr) {
        int buy_price = arr[0];
        int profit = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < buy_price) {
                buy_price = arr[i];
            } else {
                int current_profit = arr[i] - buy_price;
                profit = Math.max(profit, current_profit);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {4,1,2,};

        System.out.println(bestTime(prices));
    }
}
