package org.example.string;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterCombinationsPhoneNumberImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String str, List<String> expectedResult)
    {
        List<String> actualResult = LetterCombinationsPhoneNumberImpl.letterCombinations(str);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of("", Collections.emptyList()),
                Arguments.of("1", Collections.emptyList()),
                Arguments.of("2", List.of("a", "b", "c")),
                Arguments.of("23", List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"))
        );
    }

}