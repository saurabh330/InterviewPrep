package com.saurabh.array;

public class StockBuyAndSell2 {
    public static int maxProfit(int[] price, int n) {
        int profit = 0;
        for (int i = 1; i < n ; i++) {
            if(price[i] > price[i-1]) {
                profit += (price[i] - price[i-1]);

            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] price = new int[] {1,5,3,8,12};
        System.out.println("The maxprofit for the given prices is: "+ maxProfit(price,price.length));
    }
}
