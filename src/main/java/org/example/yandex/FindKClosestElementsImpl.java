package org.example.yandex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array.
 * The result should also be sorted in ascending order.
 */
public class FindKClosestElementsImpl
{

    public static List<Integer> findClosestElements(int[] arr, int k, int x)
    {
        int length = arr.length;
        if (length <= k)
        {
            return Arrays.stream(arr)
                    .boxed()
                    .collect(Collectors.toList());
        }

        int start = 0, end = length - 1;
        while (end - start > k)
        {
            if (Math.abs(arr[end] - x) < Math.abs(arr[start] - x))
            {
                start++;
            }
            else
            {
                end--;
            }
        }

        return Arrays.stream(Arrays.copyOfRange(arr, start, end))
                .boxed()
                .collect(Collectors.toList());
    }
}
