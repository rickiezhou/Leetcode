/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author Rickie
 */
public class BestTimeBuySellStockII {
   static int[] prices={1,1,2,3,5,3,2,3,4,4,5,8,9,10,12,5};
      public static int maxProfit(int[] prices) {
        int profit = 0;
        int size = prices.length;
        for(int i=1;i<size;i++){
            if(prices[i-1]<prices[i])profit +=prices[i]-prices[i-1];
        }
          System.out.println(profit);
        return profit;
    }
       public static void main(String[] args) {
     maxProfit(prices);
    }
}
