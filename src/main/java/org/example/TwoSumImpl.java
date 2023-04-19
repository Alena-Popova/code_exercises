package org.example;

public class TwoSumImpl
{
    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     */
    public static int[] execute(int[] nums, int target)
    {
        final int length = nums.length;
        for (int firstIndex = 0; firstIndex < length; firstIndex++)
        {
            for (int secondIndex = firstIndex + 1; secondIndex < length; secondIndex++)
            {
                if (nums[firstIndex] + nums[secondIndex] == target)
                {
                    return new int[]{firstIndex, secondIndex};
                }
            }
        }
        throw new RuntimeException("Massive has no decision");
    }
}
