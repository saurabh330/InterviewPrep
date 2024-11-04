package com.saurabh.dp;

/**
 * What is subsequence?
 * Subsequence is zero or more characters which may not be in order.
 * */

public class LongestCommonSubsequenceRecursive {
    static int longestCommonSubsequenceRecursive(String s1,String s2, int m, int n) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (s1.charAt(m-1)==s2.charAt(n-1)) {
            return 1+longestCommonSubsequenceRecursive(s1,s2,m-1,n-1);
        } else {
            return Math.max(longestCommonSubsequenceRecursive(s1,s2,m-1,n),longestCommonSubsequenceRecursive(s1,s2,m,n-1));
        }
    }

    public static void main(String[] args) {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        System.out.println("Longest common subsequence in s1 and s2 is of length: "+ longestCommonSubsequenceRecursive(s1,s2,s1.length(),s2.length()));
    }

}
