package com.saurabh.array;

public class MajorityElement {
    public static int majorityElement(int[] arr, int n) {
        int count = 1, element = arr[0];
        for (int i = 1;i < n; i++) {
            if (arr[i] == element) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                element = arr[i];
                count++;
            }
        }
        if (count > 1) {
            return element;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {8,7,6,8,6,6,6,6};
        System.out.println("Majority element is : "+ majorityElement(arr,arr.length));

    }
}
