package org.example.amazon;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageSalaryExcludingTheMinimumAndMaximumSalaryImplTest
{
    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] salary, double expectedResult)
    {
        double actualResult = AverageSalaryExcludingTheMinimumAndMaximumSalaryImpl.average(salary);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{4000,3000,2000}, 3000.00000),
                Arguments.of(new int[]{4000,3000,1000,2000}, 2500.00000)
        );
    }

}