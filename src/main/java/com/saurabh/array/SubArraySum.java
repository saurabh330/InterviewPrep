package com.saurabh.array;

public class SubArraySum {
    public static boolean subArrayForSum(int[] arr, int sum) {
        int start = 0, curr = 0;
        for (int end = 0; end < arr.length; end++) {
            curr += arr[end];
            while(sum < curr ) {
                curr -= arr[start];
                start++;
            }
            if (curr == sum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {4,8,12,5};
        System.out.println("Sub array with sum exists: " + subArrayForSum(arr,17));
    }
}
