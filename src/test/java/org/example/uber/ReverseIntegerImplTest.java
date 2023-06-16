package org.example.uber;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int value, int expectedResult)
    {
        int actualResult = ReverseIntegerImpl.reverse(value);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(-1234, -4321),
                Arguments.of(-1, -1),
                Arguments.of(10, 1),
                Arguments.of(12, 21)
        );
    }

}