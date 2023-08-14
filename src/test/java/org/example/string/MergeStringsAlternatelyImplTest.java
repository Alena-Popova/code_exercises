package org.example.string;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeStringsAlternatelyImplTest
{
    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String word1, String word2, String expectedResult)
    {
        String actualResult = MergeStringsAlternatelyImpl.mergeAlternately(word1, word2);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of("abc", "pqr", "apbqcr")
        );
    }


}