package org.example.yandex;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array if you can flip at most one 0.
 */
public class MaxConsecutiveOnesImpl
{


    /**
     * 1 <= nums.length <= 105
     * nums[i] is either 0 or 1
     */
    public static int findMaxConsecutiveOnes(int[] nums)
    {
        int length = nums.length;
        if (length == 1)
        {
            return 1;
        }
        int maxLength = 0;
        for (int i = 0; i < length; i++)
        {
            if (i == 0 || nums[i] == 0 || nums[i - 1] == 0)
            {
                boolean wasZero = false;
                for (int j = i; j < length; j++)
                {
                    if (nums[j] == 0)
                    {
                        if (wasZero)
                        {
                            maxLength = Math.max(j - i, maxLength);
                            break;
                        }
                        else
                        {
                            wasZero = true;
                        }
                    }
                    if (j == length - 1)
                    {
                        maxLength = Math.max(j + 1 - i, maxLength);
                        i = length - 1;
                        break;
                    }
                }
            }
        }
        return maxLength;
    }

}
