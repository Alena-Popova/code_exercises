package org.example.interviewcake;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class RotatedPointImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String[] words, int expectedResult)
    {
        int actualResult = RotatedPointImpl.getRotatedPoint(words);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new String[]{"ptolemaic", "retrograde", "supplant", "undulate", "xenoepist", "asymptote", "babka", "banoffee", "engender", "karpatka", "othellolagkage"}, 5)
        );
    }

}