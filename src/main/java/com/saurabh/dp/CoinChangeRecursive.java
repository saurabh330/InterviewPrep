package com.saurabh.dp;

public class CoinChangeRecursive {
    public static int coinChangeRecursive(int[] coins, int amount) {
        if (amount == 0) return 0;
        int minCoins = Integer.MAX_VALUE;
        for (int coin: coins) {
            if (amount - coin >= 0) {
                int res = coinChangeRecursive(coins,amount-coin);
                if (res >= 0 && res < minCoins) minCoins = 1 + res;
            }
        }
        return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
    }
    public static void main(String args[]) {
        int[] coins = new int[] {1,3,5,7};
        System.out.println("Min coins needed for total of 7 is : "+ coinChangeRecursive(coins,11));
    }
}
