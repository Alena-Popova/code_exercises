package org.example;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateSolutionImpl
{

    /**
     * Given an integer array nums,
     * return true if any value appears at least twice in the array, and return false if every element is distinct.
     */
    public static boolean execute(int[] nums)
    {
        final Set<Integer> numericBank = new HashSet<>();
        final int length = nums.length;
        if (length <= 1)
        {
            return false;
        }
        for (final int num : nums)
        {
            if (numericBank.contains(num))
            {
                return true;
            }
            numericBank.add(num);
        }
        return false;
    }

}
