package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(char[] array, char[] expectedResult)
    {
        char[] actualResult = ReverseStringImpl.reverseString(array);
        assertArrayEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new char[]{'s'}, new char[]{'s'}),
                Arguments.of(new char[]{'s', 'w'}, new char[]{'w', 's'}),
                Arguments.of(new char[]{'s', 'e', 'r'}, new char[]{'r', 'e', 's'}),
                Arguments.of(new char[]{'s', 'e', 'r', 'a'}, new char[]{'a', 'r', 'e', 's'})
        );
    }

}