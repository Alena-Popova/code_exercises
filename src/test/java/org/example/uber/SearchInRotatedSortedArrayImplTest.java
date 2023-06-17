package org.example.uber;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInRotatedSortedArrayImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] nums, int target, int expectedResult)
    {
        int actualResult = SearchInRotatedSortedArrayImpl.search(nums, target);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{4, 5, 6, 7, 0, 1, 2}, 2, 6)
        );
    }
}