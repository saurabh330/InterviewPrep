package com.saurabh.dp.distinctways;

public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        int grid[][] = new int[m][n];
        return dest(grid,m,n,0,0);
    }
    private static int dest(int[][] grid, int m, int n, int i, int j) {
        if (i >= m || j >= n ) return 0;
        if (i == m-1 && j == n-1) return 1;
        if ( grid[i][j] > 0) return grid[i][j];
        return grid[i][j] = dest(grid,m,n,i+1,j) + dest(grid,m,n,i,j+1);
    }
    public static void main(String[] args) {
        System.out.println("Unique paths in a matrix of 3x7 is: "+ uniquePaths(3,7));
    }
}
