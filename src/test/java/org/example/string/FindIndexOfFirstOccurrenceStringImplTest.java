package org.example.string;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class FindIndexOfFirstOccurrenceStringImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test_strStr(String haystack, String needle, int expectedResult)
    {
        int actualResult = FindIndexOfFirstOccurrenceStringImpl.strStr(haystack, needle);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test_strStrByCycle(String haystack, String needle, int expectedResult)
    {
        int actualResult = FindIndexOfFirstOccurrenceStringImpl.strStr(haystack, needle);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of("sadbutsad", "sad", 0),
                Arguments.of("ladbutsad", "sad", 6),
                Arguments.of("leetcode", "leeto", -1),
                Arguments.of("al", "ale", -1)
        );
    }

}