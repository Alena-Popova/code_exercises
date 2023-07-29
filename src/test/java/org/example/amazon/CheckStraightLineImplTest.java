package org.example.amazon;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckStraightLineImplTest
{
    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[][] coordinates, boolean expectedResult)
    {
        boolean actualResult = CheckStraightLineImpl.checkStraightLine(coordinates);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[][]{{4, 8}, {-2, 8}, {1, 8}, {8, 8}, {-5, 8}, {0, 8}, {7, 8}, {5, 8}}, true)
        );
    }

}