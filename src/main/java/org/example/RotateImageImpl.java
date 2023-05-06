package org.example;

import java.util.Arrays;

public class RotateImageImpl
{

    /**
     * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
     * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
     * DO NOT allocate another 2D matrix and do the rotation.
     * n == matrix.length == matrix[i].length
     * 1 <= n <= 20
     * -1000 <= matrix[i][j] <= 1000
     */
    public static int[][] execute(int[][] nums)
    {
        final int length = nums[0].length;
        if (length == 1)
        {
            return nums;
        }
        for (int i = 0; i < length; i++)
        {
            int columnIndex = length - 1 - i;
            for (int j = 0; j < length; j++)
            {
                if (i < length - j)
                {
                    int rowIndex = j;
                    int temp = nums[i][j];
                    nums[i][j] = nums[rowIndex][columnIndex];
                    nums[rowIndex][columnIndex] = temp;
                    System.out.printf("%s %s [%s] to %s %s [%s] \n", i, j, temp, rowIndex, columnIndex, nums[i][j]);
                }
            }
        }
        for (int i = 0; i < length; i++)
        {
            System.out.println(Arrays.toString(nums[i]));
        }
        return nums;
    }
}
