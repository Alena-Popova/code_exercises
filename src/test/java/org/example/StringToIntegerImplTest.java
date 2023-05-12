package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToIntegerImplTest
{
    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String firstStr, int expectedResult)
    {
        int actualResult = StringToIntegerImpl.myAtoi(firstStr);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of("   -42", -42),
                Arguments.of("-42", -42),
                Arguments.of("-00042", -42),
                Arguments.of("0032", 32),
                Arguments.of("4193 with words", 4193),
                Arguments.of("words and 987", 0)
        );
    }
}