package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesImplTest
{
    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] array, int[] expectedResult)
    {
        int[] actualResult = MoveZeroesImpl.execute(array);
        assertArrayEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{1}, new int[]{1}),
                Arguments.of(new int[]{0, 1}, new int[]{1, 0}),
                Arguments.of(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0})
        );
    }


}