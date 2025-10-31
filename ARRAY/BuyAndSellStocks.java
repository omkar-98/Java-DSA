// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a 
// different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.




public class BuyAndSellStocks {
    static int sellStock(int[] prices) {

        int n = prices.length;
        int minValue = prices[0];  // this is the first value 
        int profit = 0; // we cant sell stocks on same price

        for (int i = 1; i < n; i++) {
            int diffr = prices[i] - minValue; // if we sell stock at ith index then the diffrence is the diffrence
            if (profit < diffr) { 
                profit = diffr; // update the profit whose value is max 
            }

            if (minValue > prices[i]) {
                minValue = prices[i];   // update min value by checking which is min and update 
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int prices[]= {12,3,7,5,11,8};
        int result = sellStock(prices);
        System.out.println(result);
    }
}
