package org.example.amazon;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/unique-number-of-occurrences/
 * Given an array of integers arr,
 * return true if the number of occurrences of each value in the array is unique or false otherwise.
 */
public class UniqueNumberOfOccurrencesImpl
{
    /**
     * 1 <= arr.length <= 1000
     * -1000 <= arr[i] <= 1000
     */
    public boolean uniqueOccurrences(int[] arr)
    {
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.collectingAndThen(Collectors.counting(), count -> count > 1)))
                .values()
                .stream()
                .noneMatch(Boolean::booleanValue);
    }
}
