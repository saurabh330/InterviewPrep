package com.saurabh.array;

public class leftRotateByD {
    public static void leftRotate(int[] arr, int n, int d) {
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for ( int i = d; i< n; i++) {
            arr[i-d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n-d+i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        System.out.println("Array after left rotating by 2 is: ");
        leftRotate(arr,arr.length,2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
