package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PlusOneImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] array, int[] expectedResult)
    {
        int[] actualResult = PlusOneImpl.execute(array);
        assertArrayEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{8}, new int[]{9}),
                Arguments.of(new int[]{9}, new int[]{1, 0}),
                Arguments.of(new int[]{9, 9, 9, 9}, new int[]{1, 0, 0, 0, 0})
        );
    }

}