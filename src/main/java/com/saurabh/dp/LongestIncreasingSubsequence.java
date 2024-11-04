package com.saurabh.dp;
//Time Complexity: O(nlogn)
//Space Complexity: O(n)
public class LongestIncreasingSubsequence {
    public static int lisBinarySearch(int arr[], int n) {
        int tail[] = new int[n];
        int len = 1;
        tail[0] = arr[0];
        for (int i= 1; i < n; i++) {
            if ( arr[i] > tail[len-1]) {
                tail[len] = arr[i];
                len++;
            } else {
                int c = ceilIdx(tail,0,len-1,arr[i]);
                tail[c] = arr[i];
            }
        }
        return len;
    }

    private static int ceilIdx(int[] tail, int start, int end, int x) {
        while (end > start) {
            int mid = start + (end-start)/2;
            if(tail[mid] >= x) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {8,100,150,10,12,14,110};
        System.out.println("Longest Increasing Subsequence is of length: "+ lisBinarySearch(arr,arr.length));
    }
}
