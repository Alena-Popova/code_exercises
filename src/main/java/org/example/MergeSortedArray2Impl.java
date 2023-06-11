package org.example;

public class MergeSortedArray2Impl
{
    public static int[] merge(int[] nums1, int length1, int[] nums2, int length2)
    {
        int countOne = length1 - 1;
        int countTwo = length2 - 1;
        int commonIterator = length1 + length2 - 1;

        while (commonIterator >= 0)
        {
            if (countTwo < 0 || (countOne >= 0 && nums1[countOne] > nums2[countTwo]))
            {
                nums1[commonIterator] = nums1[countOne];
                countOne--;
            }
            else
            {
                nums1[commonIterator] = nums2[countTwo];
                countTwo--;
            }
            commonIterator--;
        }
        return nums1;
    }
}
