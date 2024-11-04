package com.saurabh.array;

public class MaxLengthEvenOddSubArray {
    public static int maxEvenOddSubArray(int[] arr, int n) {
        int res,curr;
        res = 1;
        curr = 1;

        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2 == 0 && arr[i-1] % 2 !=0) || (arr[i] % 2 != 0 && arr[i-1] % 2 ==0)) {
                curr++;
                res = Math.max(res,curr);
            } else {
                curr = 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {15,10,20,6,3,8};
        System.out.println("Max Length Even Odd Subarray is: "+ maxEvenOddSubArray(arr,arr.length));
    }
}
