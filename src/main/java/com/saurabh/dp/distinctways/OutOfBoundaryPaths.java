package com.saurabh.dp.distinctways;

import java.sql.SQLOutput;

public class OutOfBoundaryPaths {
    static int[][] dir = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};

    static Integer[][][] dp = new Integer[51][51][51];
    static int mod = 1000000007;
    public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        if (startRow < 0 || startColumn < 0 || startRow == m || startColumn == n) return 1;

        if (maxMove == 0) return 0;

        if (dp[startRow][startColumn][maxMove] != null) {
            return dp[startRow][startColumn][maxMove];
        }
        dp[startRow][startColumn][maxMove] = 0;
        for ( int[] d : dir) {
            dp[startRow][startColumn][maxMove] += findPaths(m,n,maxMove-1,startRow-d[0],startColumn-d[1]);
            dp[startRow][startColumn][maxMove] %= mod;
        }
        return dp[startRow][startColumn][maxMove];
    }

    public static void main (String[] args) {
//        System.out.println("Out of Boundary paths for the given input is : "+ findPaths(2,2,2,0,0));
        System.out.println("Out of Boundary paths for the given input is : "+ findPaths(1,3,3,0,1));
    }

}
