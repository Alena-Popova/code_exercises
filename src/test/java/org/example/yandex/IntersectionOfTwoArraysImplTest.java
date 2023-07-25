package org.example.yandex;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IntersectionOfTwoArraysImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] arr1, int[] arr2, int[] expectedResult)
    {
        int[] actualResult = IntersectionOfTwoArraysImpl.intersect(arr1, arr2);
        assertArrayEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 2, 1}, new int[]{2, 2}, new int[]{2, 2})
        );
    }

}