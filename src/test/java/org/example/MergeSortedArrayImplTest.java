package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] nums1, int[] nums2, int[] expectedResult)
    {
        int[] actualResult = MergeSortedArrayImpl.merge(nums1, nums2);
        assertArrayEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{}, new int[]{}, new int[]{}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{2, 5, 6}, new int[]{1, 2, 2, 3, 5, 6}),
                Arguments.of(new int[]{1}, new int[]{}, new int[]{1}),
                Arguments.of(new int[]{}, new int[]{2}, new int[]{2}),
                Arguments.of(new int[]{0}, new int[]{1}, new int[]{0, 1})
        );
    }

}