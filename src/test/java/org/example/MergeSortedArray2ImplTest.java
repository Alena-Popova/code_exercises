package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArray2ImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] nums1, int m, int[] nums2, int n, int[] expectedResult)
    {
        int[] actualResult = MergeSortedArray2Impl.merge(nums1, m, nums2, n);
        assertArrayEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{}, 0, new int[]{}, 0, new int[]{}),
                Arguments.of(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6}),
                Arguments.of(new int[]{1}, 1, new int[]{}, 0, new int[]{1}),
                Arguments.of(new int[]{0}, 0, new int[]{2}, 1, new int[]{2}),
                Arguments.of(new int[]{0, 0}, 1, new int[]{1}, 1, new int[]{0, 1})
        );
    }

}