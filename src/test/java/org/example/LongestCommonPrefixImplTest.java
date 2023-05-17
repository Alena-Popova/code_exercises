package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String[] array, String expectedResult)
    {
        String actualResult = LongestCommonPrefixImpl.longestCommonPrefix(array);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new String[]{"flower", "flow", "flight"}, "fl"),
                Arguments.of(new String[]{"dog", "racecar", "car"}, ""),
                Arguments.of(new String[]{"dog", "dracecar", "d"}, "d"),
                Arguments.of(new String[]{"dog", "dracecar", "d", ""}, "")
        );
    }

}