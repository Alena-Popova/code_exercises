package org.example.yandex;

/**
 * https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
 * Given a binary array nums, you should delete one element from it.
 * Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.
 */
public class LongestSubarrayAfterDeletingOneElementImpl
{

    /**
     * Constraints:
     * <p>
     * 1 <= nums.length <= 105
     * nums[i] is either 0 or 1.
     */
    public static int longestSubarray(int[] nums)
    {
        int length = nums.length;
        int maxSequence = 0;
        for (int i = 0; i < length; i++)
        {
            boolean wasZero = false;
            int counter = 0;
            for (int j = i; j < length; j++)
            {
                if (j == length - 1)
                {
                    return Math.max(nums[j] == 1 && wasZero ? counter + 1 : counter, maxSequence);
                }
                if (nums[j] == 1)
                {
                    counter++;
                }
                else if (nums[j] == 0)
                {
                    if (wasZero)
                    {
                        maxSequence = Math.max(counter, maxSequence);
                        break;
                    }
                    else
                    {
                        wasZero = true;
                    }
                }
            }
        }
        return maxSequence;
    }
}
