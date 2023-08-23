package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 */
public class SpiralMatrixImpl
{

    /**
     * Constraints:
     * <p>
     * m == matrix.length
     * n == matrix[i].length
     * 1 <= m, n <= 10
     * -100 <= matrix[i][j] <= 100
     * <p>
     * right  row, col + 1
     * down   row - 1, col
     * left   row, col - 1
     * up     row + 1, col
     */
    public static List<Integer> spiralOrder(int[][] matrix)
    {
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int columnStart = 0;
        int columnEnd = matrix[0].length - 1;

        List<Integer> result = new ArrayList<>();

        while (columnStart <= columnEnd && rowStart <= rowEnd)
        {
            for (int i = columnStart; i <= columnEnd; i++)
            {
                result.add(matrix[rowStart][i]);
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++)
            {
                result.add(matrix[i][columnEnd]);
            }
            columnEnd--;
            if (rowStart <= rowEnd)
            {
                for (int i = columnEnd; i >= columnStart; i--)
                {
                    result.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }
            if (columnStart <= columnEnd)
            {
                for (int i = rowEnd; i >= rowStart; i--)
                {
                    result.add(matrix[i][columnStart]);
                }
                columnStart++;
            }
        }
        return result;
    }
}
