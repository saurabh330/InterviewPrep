package com.saurabh.array;

public class FrequenciesInSortedArray {
    public static void printFrequencies(int[] arr, int n) {
        int frequency = 1, i = 1;
        while (i < n) {
            while ( i < n && arr[i] == arr[i-1]) {
                frequency++;
                i++;
            }
            System.out.println(arr[i-1]+ " " + frequency);
            i++;
            frequency = 1;
        }
        if (n == 1 || arr[n-1] != arr[n-2]) {
            System.out.println(arr[n-1]+ " " + 1);
        }
    }

    public static void main (String[] args) {
        int[] arr = new int[] {30,40,50,50,60};
        printFrequencies(arr,arr.length);
    }
}
