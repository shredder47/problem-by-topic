package array;


//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeToBuyAndSellStock {


    //[7,1,5,3,6,4]
    //i=0 , min=7,max=7
    //i=1 , min=1,max= -inf
    //i=2 , min=1,max =5
    //i=3 , min=1,max =5
    //i=4 , min=1,max =6
    //i=5 , min=1,max-6

    //[2,4,1]
    //i=0, min=2,max=2,profit =0
    //i=1, min=2,max=4,profit =2
    //i=2, min=1,max=0,profit =-1
    //i
    //i


    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int price : prices) {

            if (price < min) {
                min = price;
                //when ever we find new min, reset max, coz we need to think about getting future max
                max = Integer.MIN_VALUE;
            }

            if (price > max) {
                max = price;
            }

            profit = Math.max(profit, max - min);
        }

        return profit;

    }
}
