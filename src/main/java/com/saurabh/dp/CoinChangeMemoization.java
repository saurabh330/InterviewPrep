package com.saurabh.dp;

import java.util.Arrays;

public class CoinChangeMemoization {
    public static int coinChangeMemo(int[] coins, int amount) {
        int[] memo = new int[amount+1];
        Arrays.fill(memo,-2);
        return helper(coins,amount,memo);
    }
    private static int helper(int[] coins, int amount, int[] memo) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        if (memo[amount] != -2) return memo[amount];
        int minCoins = Integer.MAX_VALUE;
        for (int coin: coins) {
            int res = helper(coins,amount-coin,memo);
            if (res >= 0 && res < minCoins) minCoins = 1 + res;
        }
        memo[amount] = (minCoins == Integer.MAX_VALUE ? -1 : minCoins);
        return memo[amount];
    }
    public static void main(String args[]) {
        int[] coins = new int[] {1,2,5};
        System.out.println("Minimum coins needed is: "+ coinChangeMemo(coins,11));
    }
}
