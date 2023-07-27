package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsImplTest
{
    @ParameterizedTest
    @MethodSource("provideTestData")
    void test_climbStairsByRecursion(int n, int expectedResult)
    {
        int actualResult = ClimbingStairsImpl.climbStairsByRecursion(n);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test_climbStairsByCycle(int n, int expectedResult)
    {
        int actualResult = ClimbingStairsImpl.climbStairsByCycle(n);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(3, 3),
                Arguments.of(4, 5)
        );
    }

}