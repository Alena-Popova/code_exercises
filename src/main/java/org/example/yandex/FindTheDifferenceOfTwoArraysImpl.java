package org.example.yandex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 * <p>
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * Note that the integers in the lists may be returned in any order.
 */
public class FindTheDifferenceOfTwoArraysImpl
{

    /**
     * 1 <= nums1.length, nums2.length <= 1000
     * -1000 <= nums1[i], nums2[i] <= 1000
     */
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2)
    {
        Set<Integer> listOne = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> listTwo = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        Set<Integer> resultOne = new HashSet<>(listOne);
        resultOne.removeAll(listTwo);

        Set<Integer> resultTwo = new HashSet<>(listTwo);
        resultTwo.removeAll(listOne);

        return Stream.of(resultOne, resultTwo)
                .map(ArrayList::new)
                .collect(Collectors.toList());
    }
}
