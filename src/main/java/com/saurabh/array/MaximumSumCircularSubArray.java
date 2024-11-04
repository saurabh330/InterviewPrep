package com.saurabh.array;

public class MaximumSumCircularSubArray {

    public static int overallMaxSum(int[] arr, int n) {
        int maxNormal = normalMaxSum(arr,n);
        if (maxNormal < 0) {
            return maxNormal;
        }
        int arrSum = 0;
        for (int i= 0; i < n; i++) {
            arrSum += arr[i];
            arr[i] = -arr[i];
        }
        int maxCircular = arrSum + normalMaxSum(arr,n);
        return Math.max(maxCircular,maxNormal);
    }

    public static int normalMaxSum(int[] arr,int n) {
        int res = arr[0], maxEnding = arr[0];
        for (int i= 1; i < n; i++) {
            maxEnding = Math.max(arr[i],arr[i]+maxEnding);
            res = Math.max(res,maxEnding);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {5,-2,3,4};
        System.out.println("Maximum sum of a circular subarray is: " + overallMaxSum(arr,arr.length));
    }
}
