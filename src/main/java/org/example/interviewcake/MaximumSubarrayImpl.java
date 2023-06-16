package org.example.interviewcake;

public class MaximumSubarrayImpl
{

    public  static int maxSubArray(int[] nums) {

        int currentSumm = nums[0];
        int maxSumm = nums[0];

        for(int i = 1; i < nums.length; i ++) {
            currentSumm = Math.max(nums[i], currentSumm + nums[i]);

            maxSumm = Math.max(maxSumm, currentSumm);
        }

        return maxSumm;
    }
}
