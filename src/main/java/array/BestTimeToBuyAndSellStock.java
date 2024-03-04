package array;


//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int profit = 0;

        int min = Integer.MAX_VALUE;

        for (int price : prices) {

            if (price < min) {
                min = price;
                //when ever we find new min, reset max, coz we need to think about getting future max
            }

            //each day we are comparing what max profit can be made by finding new min(if found later also)
            profit = Math.max(profit, price - min);
        }

        return profit;

    }
}
