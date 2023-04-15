package org.example;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberSolutionImpl
{

    /**
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     * You must implement a solution with a linear runtime complexity and use only constant extra space.
     */
    public static int execute(int[] nums)
    {
        final int length = nums.length;
        if (length == 1)
        {
            return nums[0];
        }
        final Map<Integer, Boolean> numericBank = new HashMap<>();
        for (final int i : nums)
        {
            boolean numericContains = numericBank.containsKey(i);
            if (numericContains && !numericBank.get(i))
            {
                numericBank.replace(i, true);
            }
            else if (!numericContains)
            {
                numericBank.put(i, false);
            }
        }
        return numericBank.entrySet().stream()
                .filter(entry -> Boolean.FALSE.equals(entry.getValue()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("___"))
                .getKey();
    }

}
