package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesImplTest
{
    @ParameterizedTest
    @MethodSource("provideArrays")
    void testBark(int[] array, int expectedResult)
    {
        int actualResult = RemoveDuplicatesImpl.execute(array);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideArrays()
    {
        return Stream.of(
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{99}, 1),
                Arguments.of(new int[]{1, 2, 3}, 3),
                Arguments.of(new int[]{1, 1, 2, 3, 4, 4, 4, 99}, 5),
                Arguments.of(new int[]{0, 1, 1, 1, 1, 1}, 2)
        );
    }
}