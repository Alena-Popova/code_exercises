package org.example.arrays;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] nums, int target, int expectedResult)
    {
        int actualResult = BinarySearchImpl.search(nums, target);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{5}, -5, -1),
                Arguments.of(new int[]{5}, 5, 0),
                Arguments.of(new int[]{2, 5}, 2, 0),
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 2, -1)
        );
    }

}