package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainsDuplicateSolutionImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] array, boolean expectedResult)
    {
        boolean actualResult = ContainsDuplicateSolutionImpl.execute(array);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{}, false),
                Arguments.of(new int[]{1}, false),
                Arguments.of(new int[]{1, 2}, false),
                Arguments.of(new int[]{1, 1, 2}, true),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8}, true)
        );
    }

}