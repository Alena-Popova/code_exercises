package org.example.yandex;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RobotReturnToOriginImplTest
{
    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String moves, boolean expectedResult)
    {
        boolean actualResult = RobotReturnToOriginImpl.judgeCircle(moves);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of("UD", true),
                Arguments.of("LL", false)
        );
    }

}