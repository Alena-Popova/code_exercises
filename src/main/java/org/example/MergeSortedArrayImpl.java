package org.example;

public class MergeSortedArrayImpl
{

    public static int[] merge(int[] nums1, int[] nums2)
    {
        final int resultLength = nums1.length + nums2.length;
        int[] result = new int[resultLength];

        int countOne = nums1.length - 1;
        int countTwo = nums2.length - 1;
        int commonIterator = resultLength - 1;

        while (commonIterator >= 0)
        {
            if (countTwo < 0 || (countOne >= 0 && nums1[countOne] > nums2[countTwo]))
            {
                result[commonIterator--] = nums1[countOne--];
            }
            else
            {
                result[commonIterator--] = nums2[countTwo--];
            }
        }
        return result;
    }
}
