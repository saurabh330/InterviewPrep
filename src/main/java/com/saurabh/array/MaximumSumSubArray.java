package com.saurabh.array;

public class MaximumSumSubArray {
    public static int maxSubArraySum(int[] arr, int n) {
        int res = arr[0];
        int[] maxEnding = new int[n];
        maxEnding[0] = arr[0];
        for (int i= 1; i < n; i++) {
            maxEnding[i] = Math.max(arr[i],maxEnding[i-1]+arr[i]);
            res = Math.max(res,maxEnding[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {-5,1,-2,3,-1,2,-2};
        System.out.println("Maximum Sum SubArray is : "+ maxSubArraySum(arr,arr.length));
    }

}
