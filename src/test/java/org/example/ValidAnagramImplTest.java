package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidAnagramImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String firstStr, String secondStr, boolean expectedResult)
    {
        boolean actualResult = ValidAnagramImpl.isAnagram(firstStr, secondStr);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of("anagram", "nagaram", true),
                Arguments.of("rat", "car", false)
        );
    }
}