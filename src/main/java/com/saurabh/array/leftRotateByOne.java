package com.saurabh.array;

public class leftRotateByOne {
    public static void leftRotate(int[] arr,int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {2,4,6,9,12};
        leftRotate(arr,arr.length);
        for ( int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
