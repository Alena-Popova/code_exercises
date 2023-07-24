package org.example.yandex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentWordsImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String[] words, int k, List<String> expectedResult)
    {
        List<String> actualResult = TopKFrequentWordsImpl.topKFrequent(words, k);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {

        return Stream.of(
                Arguments.of(new String[]{"i","love","leetcode","i","love","coding"}, 2,  new ArrayList<>(Arrays.asList("i","love")))
        );
    }

}