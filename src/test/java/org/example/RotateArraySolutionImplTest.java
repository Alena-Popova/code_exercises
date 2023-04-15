package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArraySolutionImplTest
{

    @ParameterizedTest
    @MethodSource("provideArrays")
    void testBark(int[] givenArray, int steps, int[] expectedArray)
    {
        int[] actualArray = RotateArraySolutionImpl.execute(givenArray, steps);
        assertArrayEquals(expectedArray, actualArray);
    }

    private static Stream<Arguments> provideArrays()
    {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 1, new int[]{3, 1, 2}),
                Arguments.of(new int[]{1, 2, 3}, 2, new int[]{2, 3, 1}),
                Arguments.of(new int[]{1, 2, 3}, 3, new int[]{1, 2, 3}),
                Arguments.of(new int[]{1, 2, 3}, 5, new int[]{2, 3, 1})
        );
    }

}