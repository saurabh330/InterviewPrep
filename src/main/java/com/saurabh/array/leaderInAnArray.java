package com.saurabh.array;
/*
 *Leader is an element in an Array which does not have any greater element in its right side of the array.
 */
public class leaderInAnArray {
    public static void printLeaderElements(int[] arr, int n) {
        int currentLeader = arr[n-1];
        System.out.print(currentLeader + " ");
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] > currentLeader) {
                currentLeader = arr[i];
                System.out.print(currentLeader + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {7,10,4,10,6,5,2};
        printLeaderElements(arr,arr.length);
    }
}

