package org.example.amazon;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ShuffleTheArrayImplTest
{
    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] nums, int n, int[] expectedResult)
    {
        int[] actualResult = ShuffleTheArrayImpl.shuffle(nums, n);
        assertArrayEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{2, 5, 1, 3, 4, 7}, 3, new int[]{2, 3, 5, 4, 1, 7})
        );
    }

}