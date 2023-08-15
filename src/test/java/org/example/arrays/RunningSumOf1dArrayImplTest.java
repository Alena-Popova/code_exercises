package org.example.arrays;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RunningSumOf1dArrayImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] nums, int[] expectedResult)
    {
        int[] actualResult = RunningSumOf1dArrayImpl.runningSum(nums);
        assertArrayEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 3, 6, 10})
        );
    }
}