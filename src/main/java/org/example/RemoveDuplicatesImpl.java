package org.example;

public class RemoveDuplicatesImpl
{

    /**
     * Given an integer array nums sorted in non-decreasing order,
     * remove the duplicates in-place such that each unique element appears only once.
     * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
     */
    public static int execute(int[] nums)
    {
        int length = nums.length;
        if (length <= 1)
        {
            return length;
        }
        int indexOfLastBiggestNumber = 0;
        for (int i = 1; i < length; i++)
        {
            if (nums[i] > nums[indexOfLastBiggestNumber])
            {
                indexOfLastBiggestNumber++;
                nums[indexOfLastBiggestNumber] = nums[i];
            }
        }
        return indexOfLastBiggestNumber + 1;
    }
}
