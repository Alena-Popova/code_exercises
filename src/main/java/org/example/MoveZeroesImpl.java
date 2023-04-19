package org.example;

public class MoveZeroesImpl
{

    /**
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * Note that you must do this in-place without making a copy of the array.
     */
    public static int[] execute(int[] nums)
    {
        final int length = nums.length;
        if (length <= 1)
        {
            return nums;
        }
        int indexNonZeroNumber = 0;
        for (int i = 0; i < length; i++)
        {
            if (nums[i] == 0)
            {
                if (indexNonZeroNumber <= i)
                {
                    indexNonZeroNumber = i + 1;
                }
                while (indexNonZeroNumber < length && nums[indexNonZeroNumber] == 0)
                {
                    indexNonZeroNumber++;
                }
                if (indexNonZeroNumber == length) {
                    return nums;
                }
                nums[i] = nums[indexNonZeroNumber];
                nums[indexNonZeroNumber] = 0;
            }
        }
        return nums;
    }
}
