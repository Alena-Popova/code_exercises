package org.example.yandex;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxConsecutiveOnesImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] nums, int expectedResult)
    {
        int actualResult = MaxConsecutiveOnesImpl.findMaxConsecutiveOnes(nums);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{0}, 1),
                Arguments.of(new int[]{0, 0}, 1),
                Arguments.of(new int[]{1, 0}, 2),
                Arguments.of(new int[]{0, 1}, 2),
                Arguments.of(new int[]{1, 0, 1, 1, 0, 1}, 4),
                Arguments.of(new int[]{1, 0, 1, 1, 0}, 4)
        );
    }
}