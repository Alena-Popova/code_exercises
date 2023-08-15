package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode.com/problems/merge-intervals/description/
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
 */
public class MergeIntervalsImpl
{

    /**
     * Constraints:
     * 1 <= intervals.length <= 104
     * intervals[i].length == 2
     * 0 <= starti <= endi <= 104
     */
    public static int[][] merge(int[][] intervals)
    {
        Arrays.sort(intervals, Comparator.comparing(interval -> interval[0]));

        List<List<Integer>> result = new ArrayList<>();
        int startCurrentInterval = intervals[0][0];
        int endCurrentInterval = intervals[0][1];
        if (intervals.length == 1)
        {
            return intervals;
        }
        for (int i = 1; i < intervals.length; i++)
        {
            if (endCurrentInterval >= intervals[i][0])
            {
                if (endCurrentInterval < intervals[i][1])
                {
                    endCurrentInterval = intervals[i][1];
                }
                if (startCurrentInterval > intervals[i][0])
                {
                    startCurrentInterval = intervals[i][0];
                }
            }
            else
            {
                result.add(Arrays.asList(startCurrentInterval, endCurrentInterval));
                startCurrentInterval = intervals[i][0];
                endCurrentInterval = intervals[i][1];
            }
            if (i == intervals.length - 1)
            {
                result.add(Arrays.asList(startCurrentInterval, endCurrentInterval));
            }
        }
        return convertToListOfArrays(result);
    }

    public static int[][] convertToListOfArrays(List<List<Integer>> listOfLists)
    {
        return listOfLists.stream()
                .map(innerList -> innerList.stream()
                        .mapToInt(Integer::intValue)
                        .toArray())
                .toArray(int[][]::new);
    }
}
