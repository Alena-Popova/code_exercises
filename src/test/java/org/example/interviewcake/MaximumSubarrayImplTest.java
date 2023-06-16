package org.example.interviewcake;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubarrayImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] nums, int expectedResult)
    {
        int actualResult = MaximumSubarrayImpl.maxSubArray(nums);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6)
        );
    }

}