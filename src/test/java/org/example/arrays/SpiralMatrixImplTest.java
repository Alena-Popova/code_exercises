package org.example.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpiralMatrixImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[][] matrix, List<Integer> expectedResult)
    {
        List<Integer> actualResult = SpiralMatrixImpl.spiralOrder(matrix);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5)),
                Arguments.of(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}, Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)),
                Arguments.of(new int[][]{{7}, {8}, {9}}, Arrays.asList(7, 8, 9))
        );
    }
}