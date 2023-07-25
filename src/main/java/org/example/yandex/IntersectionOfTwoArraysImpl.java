package org.example.yandex;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 */
public class IntersectionOfTwoArraysImpl
{
    /**
     * 1 <= nums1.length, nums2.length <= 1000
     * 0 <= nums1[i], nums2[i] <= 1000
     */
    public static int[] intersect(int[] nums1, int[] nums2)
    {
        boolean firstIsSmallest = nums1.length < nums2.length;

        int[] smallest = firstIsSmallest ? nums1 : nums2;
        int[] biggest = firstIsSmallest ? nums2 : nums1;

        Map<Integer, Long> smallestMap = Arrays.stream(smallest)
                .boxed()
                .collect(Collectors.groupingBy(value -> value, Collectors.counting()));

        return Arrays.stream(biggest)
                .boxed()
                .filter(smallestMap::containsKey)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .flatMap(entry -> Stream.generate(entry::getKey).limit(Math.min(smallestMap.get(entry.getKey()), entry.getValue())))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
