package org.example.yandex;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithAtMostKDistinctCharactersImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String str, int k, int expectedResult)
    {
        int actualResult = LongestSubstringWithAtMostKDistinctCharactersImpl.lengthOfLongestSubstringKDistinct(str, k);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of("eceba", 0, 0),
                Arguments.of("eceba", 2, 3),
                Arguments.of("aa", 1, 2)
        );
    }

}