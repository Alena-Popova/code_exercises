package org.example.string;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupAnagramsImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String[] strs, List<List<String>> expectedResult)
    {
        List<List<String>> actualResult = GroupAnagramsImpl.groupAnagrams(strs);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}, List.of(List.of("bat"), List.of("nat", "tan"), List.of("ate", "eat", "tea")))
        );
    }

}