package org.example.uber;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] nums, int target, int[] expectedResult)
    {
        int[] actualResult = TwoSumImpl.twoSum(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1})
        );
    }

}