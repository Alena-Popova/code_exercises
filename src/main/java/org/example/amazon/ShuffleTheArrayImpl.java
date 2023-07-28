package org.example.amazon;

/**
 * https://leetcode.com/problems/shuffle-the-array/
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
public class ShuffleTheArrayImpl
{
    /**
     * 1 <= n <= 500
     * nums.length == 2n
     * 1 <= nums[i] <= 10^3
     */
    public static int[] shuffle(int[] nums, int n)
    {
        int[] result = new int[nums.length];
        int iterator = 0;
        for (int i = 0; i < n; i++)
        {
            result[iterator++] = nums[i];
            result[iterator++] = nums[n + i];
        }
        return result;
    }

}
