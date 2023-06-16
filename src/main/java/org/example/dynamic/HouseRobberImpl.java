package org.example.dynamic;

public class HouseRobberImpl
{

    public int rob(int[] nums)
    {
        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (i % 2 == 0)
            {
                sumOfEven += nums[i];
            }
            else
            {
                sumOfOdd += nums[i];
            }
        }

        return Math.max(sumOfEven, sumOfOdd);

    }
}
