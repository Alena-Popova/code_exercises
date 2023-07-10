package org.example.yandex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SummaryRangesImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(int[] nums, List<String> expectedResult)
    {
        List<String> actualResult = SummaryRangesImpl.summaryRanges(nums);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {

        return Stream.of(
                Arguments.of(new int[]{0, 2, 3, 4, 6, 8, 9}, new ArrayList<>(Arrays.asList("0", "2->4", "6", "8->9"))),
                Arguments.of(new int[]{0, 1, 2, 4, 5, 7}, new ArrayList<>(Arrays.asList("0->2", "4->5", "7"))),
                Arguments.of(new int[]{-2147483648,-2147483647,2147483647}, new ArrayList<>(Arrays.asList("-2147483648->-2147483647","2147483647")))

        );
    }

}