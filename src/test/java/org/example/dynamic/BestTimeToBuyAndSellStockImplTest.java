package org.example.dynamic;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] nums, int expectedResult)
    {
        int actualResult = BestTimeToBuyAndSellStockImpl.maxProfit(nums);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5)
        );
    }
}