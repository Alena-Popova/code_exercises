package org.example.yandex;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsomorphicStringsImplTest
{
    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String s, String t, boolean expectedResult)
    {
        boolean actualResult = IsomorphicStringsImpl.isIsomorphic(s, t);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of("paper", "title", true),
                Arguments.of("foo", "bar", false),
                Arguments.of("badc", "baba", false)
        );
    }

}