package com.saurabh.array;

public class StockBuyAndSell1 {
    public static int maxProfit(int price[], int start, int end) {
        if (end <= start) {
            return 0;
        }
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i+1; j <= end; j++) {
                if (price[j] > price[i]) {
                    int currProfit = price[j] - price[i] + maxProfit(price,start,i-1) + maxProfit(price,j+1,end);
                    profit = Math.max(profit,currProfit);

                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] price = new int[] {1,5,3,8,12};
        System.out.println("The max profit possible is");
        int maxProfit = maxProfit(price,0,price.length-1);
        System.out.println("The max profit possible is: " + maxProfit );
    }
}
