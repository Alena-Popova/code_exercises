package org.example.functions;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(double x, int n, double expectedResult)
    {
        double actualResult = PowImpl.myPow(x, n);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(2, 10, 1024),
                Arguments.of(2, -2, 0.25)
        );
    }

}