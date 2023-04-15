package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberSolutionImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] givenArray, int expectedResult)
    {
        int actualResult = SingleNumberSolutionImpl.execute(givenArray);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2, 2, 99, 77, 77}, 99)
        );
    }

}