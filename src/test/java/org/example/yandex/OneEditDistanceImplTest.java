package org.example.yandex;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OneEditDistanceImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String first, String second, boolean expectedResult)
    {
        boolean actualResult = OneEditDistanceImpl.isOneEditDistance(first, second);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of("", "", false),
                Arguments.of("abc123abc", "abc123abc", false),
                Arguments.of("ab", "acb", true),
                Arguments.of("aib", "acb", true),
                Arguments.of("acbv", "acb", true),
                Arguments.of("avbv", "acb", false)
        );
    }
}