package org.example.yandex;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidPalindromeImplTest
{


    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String str, boolean expectedResult)
    {
        boolean actualResult = ValidPalindromeImpl.validPalindrome(str);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of("aba", true),
                Arguments.of("abca", true),
                Arguments.of("asdeffdsa", true),
                Arguments.of("asdffdsae", true),
                Arguments.of("abc", false)
        );
    }

}