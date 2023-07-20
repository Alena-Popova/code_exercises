package org.example.yandex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class FindKClosestElementsImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] arr, int k, int x, List<Integer> expectedResult)
    {
        List<Integer> actualResult = FindKClosestElementsImpl.findClosestElements(arr, k, x);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5}, 4, 3, Arrays.asList(1,2,3,4)),
                Arguments.of(new int[]{1,2,3,4,5}, 4, -1, Arrays.asList(1,2,3,4)),
                Arguments.of(new int[]{1,1,1,10,10,10}, 1, 9, List.of(10))
        );
    }
}