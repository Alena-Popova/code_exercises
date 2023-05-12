package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidPalindromeImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String rawStr, boolean expectedResult)
    {
        boolean actualResult = ValidPalindromeImpl.isPalindrome(rawStr);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("race a car", false),
                Arguments.of("  ", true)
        );
    }

}