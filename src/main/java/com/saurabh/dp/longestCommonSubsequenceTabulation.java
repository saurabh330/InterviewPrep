package com.saurabh.dp;

public class longestCommonSubsequenceTabulation {
     static int lcs(String s1, String s2) {
         int m = s1.length(), n = s2.length();
         int [][] dp = new int[m+1][n+1];
         for (int i = 0; i <m; i++) {
             dp[i][0] = 0;
         }
         for (int j = 0; j<= n; j++) {
             dp[0][j] = 0;
         }
         for (int i= 1; i<=m; i++) {
             for (int j = 1;j<= n ; j++) {
                 if (s1.charAt(i-1) == s1.charAt(j-1)) {
                     dp[i][j] = 1 + dp[i-1][j-1];
                 } else {
                     dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                 }
             }
         }
         return dp[m][n];
     }
     public static void main(String[] args) {
         String s1 = "AXYZ", s2 = "BAZ";
         System.out.println("Longest Common Subsequence is of length : "+ lcs(s1,s2) );
     }
}
