package org.example.string;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddBinaryImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String a, String b, String expectedResult)
    {
        String actualResult = AddBinaryImpl.addBinary(a, b);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of("11", "1", "100"),
                Arguments.of("11", "11", "110"),
                Arguments.of("1010", "1011", "10101")
        );
    }
}