package org.example.string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerateParenthesesImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int n, List<String> expectedResult)
    {
        List<String> actualResult = GenerateParenthesesImpl.generateParenthesis(n);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(1, new ArrayList<>()
                {{
                    add("()");
                }}),
                Arguments.of(3, new ArrayList<>()
                {{
                    add("((()))");
                    add("(()())");
                    add("(())()");
                    add("()(())");
                    add("()()()");
                }})
        );
    }

}