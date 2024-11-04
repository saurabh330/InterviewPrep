package com.saurabh.array;

public class removeDuplicateFromSorted {
    public static int removeDuplicates(int arr[], int n) {
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[res-1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
    int[] arr = new int[] {10,20,20,30,40,40,50};
    int n = arr.length;
    int removedDuplicateLength = removeDuplicates(arr,n);
    System.out.print("Array after removing duplicate is ");
    for (int i = 0; i < removedDuplicateLength; i++) {
        System.out.print(arr[i]);
        System.out.print(" ");
    }
    }
}
