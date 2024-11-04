package com.saurabh.dp.distinctways;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PartitionEqualSubsetSum {
    static boolean canPartition(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        return totalSum % 2 == 1 ? false : helperFunc(nums,0,totalSum/2, new Boolean[nums.length+1][totalSum/2 +1]);
    }


    private static boolean helperFunc(int[] nums, int i, int sum, Boolean[][] dp) {
        if (sum == 0) return true;
        if (sum < 0 ) return false;
        if (i >= nums.length) return false;
        if (dp[i][sum] == null) {
            dp[i][sum] = helperFunc(nums,i+1,sum - nums[i],dp) || helperFunc(nums,i+1,sum,dp);
        }
        return dp[i][sum];
    }

    public static void main(String[] args) {
        int nums[] = new int[] {1,5,11,5};
        if (canPartition(nums)) {
            System.out.println("The given nums can be partitioned into equal subsets");
        } else {
            System.out.println("The given nums can not be partitioned into equal subsets");
        }

    }

}
