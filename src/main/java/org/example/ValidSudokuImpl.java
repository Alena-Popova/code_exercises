package org.example;

import java.util.HashSet;
import java.util.Set;

public class ValidSudokuImpl
{
    public static boolean isValidSudoku(char[][] board)
    {
        for (int rowIndex = 0; rowIndex < board.length; rowIndex++)
        {
            char[] row = board[rowIndex];
            if (!isValidArray(row))
            {
                return false;
            }
            char[] column = new char[board.length];
            for (int columnIndex = 0; columnIndex < board.length; columnIndex++)
            {
                column[columnIndex] = board[rowIndex][columnIndex];
                if (rowIndex % 3 == 0 && columnIndex % 3 == 0 && rowIndex + columnIndex + 2 < board.length)
                {
                    char[] cube = new char[board.length];
                    System.arraycopy(board[rowIndex + columnIndex], rowIndex, cube, 0, 3);
                    System.arraycopy(board[rowIndex + columnIndex + 1], rowIndex, cube, 3, 3);
                    System.arraycopy(board[rowIndex + columnIndex + 2], rowIndex, cube, 6, 3);
                    if (!isValidArray(cube))
                    {
                        return false;
                    }
                }
            }
            if (!isValidArray(column))
            {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidArray(char[] array)
    {
        Set<Character> numericBank = new HashSet<>();
        for (int i = 0; i < array.length; i++)
        {
            if (Character.isDigit(array[i]))
            {
                if (numericBank.contains(array[i]))
                {
                    return false;
                }
                else
                {
                    numericBank.add(array[i]);
                }
            }
        }
        return true;
    }
}
