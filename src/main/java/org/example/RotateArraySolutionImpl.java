package org.example;

public class RotateArraySolutionImpl
{

    /**
     * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
     */
    public static int[] execute(int[] nums, int k)
    {
        int length = nums.length;
        int steps = k > nums.length
                ? k % length
                : k;
        if (length <= 1 || length == steps)
        {
            return nums;
        }
        for (int i = 0; i < steps; i++)
        {
            int temp = nums[0];
            for (int m = 1; m < length; m++)
            {
                int past = nums[m];
                nums[m] = temp;
                temp = past;
            }
            nums[0] = temp;
        }
        return nums;
    }
}
