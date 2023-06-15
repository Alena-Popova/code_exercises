package org.example.interviewcake;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderCheckerImplTest
{
    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] takeOutOrders, int[] dinnerInOrder, int[] kitchen, boolean expectedResult)
    {
        boolean actualResult = OrderCheckerImpl.checkOrder(takeOutOrders, dinnerInOrder, kitchen);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5}, new int[]{2, 4, 6}, new int[]{1, 2, 4, 6, 5, 3}, false),
                Arguments.of(new int[]{17, 8, 24}, new int[]{12, 19, 2}, new int[]{17, 8, 12, 19, 24, 2}, true)
        );
    }

}