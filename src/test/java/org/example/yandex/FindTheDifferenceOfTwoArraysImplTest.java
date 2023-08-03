package org.example.yandex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
class FindTheDifferenceOfTwoArraysImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] arr1, int[] arr2, List<List<Integer>> expectedResult)
    {
        List<List<Integer>> actualResult = FindTheDifferenceOfTwoArraysImpl.findDifference(arr1, arr2);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(List.of(3));
        expectedResult.add(Collections.emptyList());
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}, expectedResult)
        );
    }

}