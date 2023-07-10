package org.example.yandex;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximizeDistanceToClosestPersonImplTest
{
    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] seats, int expectedResult)
    {
        System.out.printf("Start %s\n", Arrays.toString(seats));
        int actualResult = MaximizeDistanceToClosestPersonImpl.maxDistToClosest(seats);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{0, 1}, 1),
                Arguments.of(new int[]{0, 0, 1}, 2),
                Arguments.of(new int[]{1, 0}, 1),
                Arguments.of(new int[]{1, 0, 0, 0}, 3),
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 2),
                Arguments.of(new int[]{1, 0, 0, 0, 1, 0, 0}, 2)
        );
    }

}