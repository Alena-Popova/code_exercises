package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharacterImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String rawStr, int expectedResult)
    {
        int actualResult = FirstUniqueCharacterImpl.firstUniqChar(rawStr);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of("leetcode", 0),
                Arguments.of("loveleetcode", 2),
                Arguments.of("aabb", -1)
        );
    }

}