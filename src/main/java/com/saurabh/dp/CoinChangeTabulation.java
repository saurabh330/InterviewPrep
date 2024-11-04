package com.saurabh.dp;

public class CoinChangeTabulation {
    public static int coinChange(int[] coins,int amount ) {
        if (amount < 1) return 0;
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (coin <= i && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
    return dp[amount];
    }

    public static void main(String args[]) {
        int[] coins = new int[] {1,3,5,9};
        System.out.println("Minimum number of coins needed are:  " + coinChange(coins,11));
    }
}