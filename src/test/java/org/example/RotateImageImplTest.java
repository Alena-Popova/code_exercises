package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateImageImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[][] array, int[][] expectedResult)
    {
        int[][] actualResult = RotateImageImpl.execute(array);
        assertArrayEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rotatedArray = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        return Stream.of(
                Arguments.of(array, rotatedArray)
        );
    }

}