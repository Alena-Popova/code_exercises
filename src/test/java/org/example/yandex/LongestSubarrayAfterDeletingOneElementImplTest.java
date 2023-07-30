package org.example.yandex;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubarrayAfterDeletingOneElementImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] arr1, int expectedResult)
    {
        int actualResult = LongestSubarrayAfterDeletingOneElementImpl.longestSubarray(arr1);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 0, 1}, 3),
                Arguments.of(new int[]{0, 1, 1, 0, 0, 1}, 2),
                Arguments.of(new int[]{1, 1, 1}, 2)
        );
    }

}