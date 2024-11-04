package com.saurabh.dp;
/**
 *Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
 *
 * You have the following three operations permitted on a word:
 *
 * Insert a character
 * Delete a character
 * Replace a character
 *
 *
 * Example 1:
 *
 * Input: word1 = "horse", word2 = "ros"
 * Output: 3
 * Explanation:
 * horse -> rorse (replace 'h' with 'r')
 * rorse -> rose (remove 'r')
 * rose -> ros (remove 'e')
 *
 * */
public class EditDistanceRecursive {
    public static int editDistance(String s1, String s2, int m, int n) {
        if (m == 0) {
            return n;
        }
        if ( n == 0) {
            return m;
        }
        if (s1.charAt(m-1) == s2.charAt(n-1)) {
            return editDistance(s1,s2,m-1,n-1);
        } else {
            return 1 + Math.min(Math.min(editDistance(s1,s2,m,n-1),editDistance(s1,s2,m-1,n)),editDistance(s1,s2,m-1,n-1));
        }
    }
    public static void main (String args[]) {
        String s1 = "SATURDAY";
        String s2 = "SUNDAY";
        System.out.println("Minimum number of operations required are : " + editDistance(s1,s2,s1.length(),s2.length()));
    }
}
