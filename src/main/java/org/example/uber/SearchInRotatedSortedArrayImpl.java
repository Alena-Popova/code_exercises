package org.example.uber;

public class SearchInRotatedSortedArrayImpl
{
    public static int search(int[] nums, int target)
    {
        int lowerBoundary = 0;
        int upperBoundary = nums.length - 1;

        while (lowerBoundary <= upperBoundary)
        {
            int mid = (upperBoundary + lowerBoundary) / 2;
            if (nums[mid] == target)
            {
                return mid;
            }
            else if (nums[lowerBoundary] < nums[mid])
            {
                if (nums[lowerBoundary] <= target && nums[mid] > target)
                {
                    upperBoundary = mid - 1;
                }
                else
                {
                    lowerBoundary = mid + 1;
                }
            }
            else
            {
                if (nums[upperBoundary] >= target && nums[mid] < target)
                {
                    lowerBoundary = mid + 1;
                }
                else
                {
                    upperBoundary = mid - 1;
                }
            }
        }
        return -1;
    }
}
