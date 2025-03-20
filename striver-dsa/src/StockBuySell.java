public class StockBuySell {

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int min = prices[0];
        for (int i = 0; i < n; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                if ((prices[i] - min) >= profit) {
                    profit = prices[i] - min;
                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }
}
