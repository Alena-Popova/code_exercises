package org.example.arrays;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] nums1, int m, int[] nums2, int n, int[] expectedResult)
    {
        MergeSortedArrayImpl.merge_v2(nums1, m, nums2, n);
        assertArrayEquals(expectedResult, nums1);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6})
        );
    }

}