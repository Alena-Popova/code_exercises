package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] array, int target, int[] expectedResult)
    {
        int[] actualResult = TwoSumImpl.execute(array, target);
        assertArrayEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{1, 0}, 1, new int[]{0, 1}),
                Arguments.of(new int[]{1, 0, 3, 4}, 7, new int[]{2, 3}),
                Arguments.of(new int[]{1, 0, 100, 0, 0, -50}, 50, new int[]{2, 5}),
                Arguments.of(new int[]{2,7,11,15}, 9, new int[]{0, 1})
        );
    }

}