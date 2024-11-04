package com.saurabh.dp.decisionmaking;

import java.util.Arrays;

public class HouseRobber {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        dp[0] = nums[0];
        return helper(nums,nums.length,dp);
    }
    private static int helper(int[] nums, int n, int[] dp) {
        if (n <= 0) return 0;
        if (dp[n-1] != -1) return dp[n-1];
        else {
            dp[n-1] = Math.max(helper(nums,n-1,dp), nums[n-1] + helper(nums, n-2, dp));
        }
        return dp[n-1];
    }
    public static void main(String args[]) {
        int[] nums = new int[] {2,7,9,3,1};
        HouseRobber hb = new HouseRobber();
        System.out.println("Total robbery by the robber would be : "+ hb.rob(nums));
    }
}
