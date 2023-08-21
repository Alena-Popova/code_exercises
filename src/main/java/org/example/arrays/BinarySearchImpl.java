package org.example.arrays;

/**
 * https://leetcode.com/problems/binary-search/
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class BinarySearchImpl
{

    /**
     * Constraints:
     * <p>
     * 1 <= nums.length <= 104
     * -104 < nums[i], target < 104
     * All the integers in nums are unique.
     * nums is sorted in ascending order.
     */
    public static int search(int[] nums, int target)
    {
        final int length = nums.length;
        int start = 0;
        int end = length;
        while (true)
        {
            int separator = (end - start) / 2;
            if (separator <= 0)
            {
                if (nums[start] == target)
                {
                    return start;
                }
                else if (end < length && nums[end] == target)
                {
                    return end;
                }
                else
                {
                    return -1;
                }
            }
            int index = start + separator;
            if (nums[index] == target)
            {
                return index;
            }
            else if (nums[index] > target)
            {
                end = index;
            }
            else
            {
                start = index;
            }
        }
    }
}
