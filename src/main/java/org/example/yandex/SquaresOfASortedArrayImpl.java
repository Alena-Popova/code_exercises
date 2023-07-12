package org.example.yandex;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 */
public class SquaresOfASortedArrayImpl
{

    /**
     * 1 <= nums.length <= 104
     * -104 <= nums[i] <= 104
     * nums is sorted in non-decreasing order.
     */
    public static int[] sortedSquares(int[] nums)
    {
        int length = nums.length;
        int[] result = new int[length];
        int startIndex = nums[0] < 0 ? 0 : -1;
        int endIndex = length - 1;
        for (int i = length - 1; i >= 0; i--)
        {
            if (startIndex >= 0 && nums[startIndex] < 0 && Math.abs(nums[startIndex]) > nums[endIndex])
            {
                result[i] = nums[startIndex] * nums[startIndex];
                startIndex++;
            }
            else if ((endIndex == startIndex && nums[endIndex] > 0)|| endIndex > startIndex)
            {
                result[i] = nums[endIndex] * nums[endIndex];
                endIndex--;
            }
            else
            {
                return Arrays.copyOfRange(result, i, length);
            }
        }
        return result;
    }
}
