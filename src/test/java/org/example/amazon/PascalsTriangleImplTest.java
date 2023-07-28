package org.example.amazon;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleImplTest
{
    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int numRows, List<List<Integer>> expectedResult)
    {
        List<List<Integer>> actualResult = PascalsTriangleImpl.generate(numRows);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(1, List.of(List.of(1))),
                Arguments.of(2, List.of(List.of(1), List.of(1, 1))),
                Arguments.of(3, List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1))),
                Arguments.of(4, List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1)))
        );
    }
}