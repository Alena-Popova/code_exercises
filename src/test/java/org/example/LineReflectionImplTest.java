package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LineReflectionImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[][] points, boolean expectedResult)
    {
        boolean actualResult = LineReflectionImpl.isReflected(points);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        int[] point_1 = new int[]{1, 1};
        int[] point_2 = new int[]{-1, 1};
        int[] point_3 = new int[]{-1, -1};

        return Stream.of(
                Arguments.of(new int[][]{new int[]{1, 1}, new int[]{-1, 1}}, true),
                Arguments.of(new int[][]{new int[]{1, 1}, new int[]{-1, -1}}, false),
                Arguments.of(new int[][]{new int[]{0, 0}, new int[]{1, 0}, new int[]{3, 0}}, false)
        );
    }
}