package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(Integer number, String expectedResult)
    {
        String actualResult = ReverseIntegerImpl.execute(number);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(0, "0"),
                Arguments.of(8, "8"),
                Arguments.of(-8, "-8"),
                Arguments.of(123, "321"),
                Arguments.of(-123, "-321")
        );
    }

}