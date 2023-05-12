package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueSequenceImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String str, String expectedResult)
    {
        String actualResult = UniqueSequenceImpl.uniqSequence(str);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of("anagram", "nagr"),
                Arguments.of("rat", "rat")
        );
    }

}