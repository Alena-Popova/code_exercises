package org.example.arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class MergeSortedArrayImpl
{
    /**
     * Constraints:
     * nums1.length == m + n
     * nums2.length == n
     * 0 <= m, n <= 200
     * 1 <= m + n <= 200
     * -109 <= nums1[i], nums2[j] <= 109
     */
    public static int[] merge(int[] nums1, int m, int[] nums2, int n)
    {
        int length = m + n;
        int[] result = new int[length];

        int firstCounter = 0;
        int secondCounter = 0;
        for (int i = 0; i < length; i++)
        {
            if (secondCounter == n || nums1[firstCounter] < nums2[secondCounter])
            {
                result[i] = nums1[firstCounter];
                firstCounter++;
            }
            else
            {
                result[i] = nums2[secondCounter];
                secondCounter++;
            }
        }
        return result;
    }

    public static void merge_v2(int[] nums1, int m, int[] nums2, int n)
    {
        int length = m + n;

        int firstCounter = m - 1;
        int secondCounter = n - 1;

        for (int i = length - 1; i >= 0; i--)
        {
            if (secondCounter < 0 || (firstCounter >= 0 && nums1[firstCounter] > nums2[secondCounter]))
            {
                nums1[i] = nums1[firstCounter];
                firstCounter--;
            }
            else
            {
                nums1[i] = nums2[secondCounter];
                secondCounter--;
            }
        }
    }
}
