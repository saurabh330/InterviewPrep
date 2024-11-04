package com.saurabh.array;

public class maximumDifferenceElement {

    public static int maxDiffElement(int[] arr, int n) {
        int res = arr[1]-arr[0];
        int min = arr[0];
        for ( int i = 1; i < n; i++) {
            res = Math.max(res, arr[i]-min);
            min = Math.min(min,arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,10,6,4,8,1};
        System.out.println("Maximum difference element is : " + maxDiffElement(arr,arr.length));

    }
}
