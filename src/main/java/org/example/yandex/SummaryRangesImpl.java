package org.example.yandex;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a sorted unique integer array nums.
 * A range [a,b] is the set of all integers from a to b (inclusive).
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
 * Each range [a,b] in the list should be output as:
 * "a->b" if a != b
 * "a" if a == b
 */
public class SummaryRangesImpl
{

    /**
     * 0 <= nums.length <= 20
     * -231 <= nums[i] <= 231 - 1
     * All the values of nums are unique.
     * nums is sorted in ascending order.
     */
    public static List<String> summaryRanges(int[] nums)
    {
        List<String> result = new ArrayList<>();
        int length = nums.length;
        int iterator = 0;

        while (iterator < length)
        {
            int start = iterator, end = iterator;
            iterator++;
            for (; iterator < length; iterator++, end++)
            {
                int diff = nums[iterator] - nums[end];
                if (diff != 1)
                {
                    break;
                }
            }
            result.add(
                    end == start
                            ? "" + nums[start]
                            : String.format("%d->%d", nums[start], nums[end])
            );
        }
        return result;
    }
}
