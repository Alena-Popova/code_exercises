package org.example.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/pascals-triangle/
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown: https://leetcode.com/problems/pascals-triangle/
 */
public class PascalsTriangleImpl
{
    /**
     * 1 <= numRows <= 30
     */
    public static List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        pascalsTriangle.add(List.of(1));
        if (numRows == 1)
        {
            return pascalsTriangle;
        }
        for (int i = 1; i < numRows; i++)
        {
            pascalsTriangle.add(getRow(pascalsTriangle.get(pascalsTriangle.size() - 1)));
        }
        return pascalsTriangle;
    }

    private static List<Integer> getRow(List<Integer> lastRow)
    {
        int[] row = new int[lastRow.size() + 1];
        row[0] = 1;
        row[lastRow.size()] = 1;
        int iterator = 1;
        for (int i = 0; i < lastRow.size() - 1; i++)
        {
            row[iterator++] = lastRow.get(i) + lastRow.get(i + 1);
        }
        return Arrays.stream(row).boxed().collect(Collectors.toList());
    }
}
