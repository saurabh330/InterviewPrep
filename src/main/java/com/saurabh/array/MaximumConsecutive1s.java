package com.saurabh.array;

public class MaximumConsecutive1s {
    public static int max1sNaive(int[] arr, int n) {
        int res = 0;
        for (int i=0; i<n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == 1) {
                    count++;
                } else break;
                res = Math.max(res,count);
            }
        }
        return res;
    }


    public static int max1sOptimal(int[] arr, int n) {
        int res = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count = 0;
            } else {
                count++;
                res = Math.max(res,count);
            }
        }
            return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {0,1,1,1,0,1,0,1,1,0};
        System.out.println("Maximum no of consecutive 1s is: " + max1sNaive(arr,arr.length));
        System.out.println("Maximum no of consecutive 1s is: " + max1sOptimal(arr,arr.length));
    }
}
