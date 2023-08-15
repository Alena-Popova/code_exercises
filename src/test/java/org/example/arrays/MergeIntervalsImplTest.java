package org.example.arrays;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeIntervalsImplTest
{
    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[][] intervals, int[][] expectedResult)
    {
        int[][] actualResult = MergeIntervalsImpl.merge(intervals);
        assertArrayEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}, new int[][]{{1, 6}, {8, 10}, {15, 18}}),
                Arguments.of(new int[][]{{1, 4}, {0, 1}}, new int[][]{{0, 4}}),
                Arguments.of(new int[][]{{1, 4}, {2, 3}}, new int[][]{{1, 4}})
        );
    }

}