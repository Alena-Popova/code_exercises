package org.example.yandex;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SquaresOfASortedArrayImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] seats, int[] expectedResult)
    {
        int[] actualResult = SquaresOfASortedArrayImpl.sortedSquares(seats);
        System.out.printf("Result = %s\n", Arrays.toString(actualResult));
        assertArrayEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{-4, -1, 0, 3, 10}, new int[]{0, 1, 9, 16, 100}),
                Arguments.of(new int[]{-7, -3, 2, 3, 11}, new int[]{4, 9, 9, 49, 121})
        );
    }
}