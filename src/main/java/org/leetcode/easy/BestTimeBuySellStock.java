package org.leetcode.easy;

public class BestTimeBuySellStock {

//    // find the min element
    public static int minArr(int[] prices) {

        int maxPrice = Integer.MAX_VALUE;
        int profit = 0;
        int currentProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < maxPrice){
                maxPrice = prices[i];
            }
            currentProfit = prices[i] - maxPrice;
            if(profit < currentProfit){
                profit = currentProfit;
            }
        }
        return profit;
    }

    public int getProfit(int[] price) {

        int maxProfit, delta;

        maxProfit = 0;

        for (int i = 0; i < price.length-1; i++) {
            for (int j = i+1; j < price.length; j++) {
//                System.out.println("price[j]: " + price[j]);
//                System.out.println("price[i]: " + price[i]);
                delta = price[j]-price[i];
//                System.out.println("delta: " + delta);
                if (delta > maxProfit) {
                    maxProfit = delta;
//                    System.out.println("maxProfit: " + maxProfit);
                }
            }
        }

        return maxProfit;
    }




    public static void main(String[] args) {
        System.out.println(minArr(new int[] {7,1,5,3,6,4}));
        System.out.println(minArr(new int[] {7,6,4,3,1}));
        System.out.println(minArr(new int[] {2,4,1}));
        System.out.println(minArr(new int[] {4, 3, 8, 10, 20}));
    }
}
