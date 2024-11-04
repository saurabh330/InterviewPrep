package com.saurabh.array;

import static java.lang.Math.max;
//sliding window technique

public class MaximumKSum {
    public static int maxKSum(int[] arr, int n, int k) {
        int curr = 0, res = 0;
        for (int i= 0; i<k ; i++) {
            curr += arr[i];
        }
        res = curr;
        for (int i=k; i< n; i++) {
            curr = curr + arr[i] - arr[i-k];
            res = max(res,curr);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,8,30,-5,20,7};
        System.out.println("The max sum for k=2 elements is "+ maxKSum(arr,arr.length,2));
    }
}
