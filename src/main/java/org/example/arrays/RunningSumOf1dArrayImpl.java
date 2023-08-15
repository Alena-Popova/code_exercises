package org.example.arrays;

/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 */
public class RunningSumOf1dArrayImpl
{
    /**
     * Constraints:
     * 1 <= nums.length <= 1000
     * -10^6 <= nums[i] <= 10^6
     */
    public static int[] runningSum(int[] nums)
    {
        final int length = nums.length;
        if (length == 0 || length == 1)
        {
            return nums;
        }
        for (int i = 1; i < length; i++)
        {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
