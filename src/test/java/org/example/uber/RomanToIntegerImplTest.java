package org.example.uber;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String value, int expectedResult)
    {
        int actualResult = RomanToIntegerImpl.romanToInt(value);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994)
        );
    }
}