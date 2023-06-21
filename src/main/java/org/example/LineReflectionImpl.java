package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class LineReflectionImpl
{


    /**
     * Given n points on a 2D plane, find if there is such a line parallel to the y-axis that reflects the given points symmetrically.
     * In other words, answer whether or not if there exists a line that after reflecting all points over the given line, the original points' set is the same as the reflected ones.
     * Note that there can be repeated points.
     */
    public static boolean isReflected(int[][] points)
    {
        return isReflected(points, 0, 1) || isReflected(points, 1, 0);
    }

    public static boolean isReflected(int[][] points, int reflectionIndex, int nonReflectionIndex)
    {
        Arrays.sort(points, Comparator.comparing(point -> point[reflectionIndex]));
        Stack<int[]> stackPoints = new Stack<>();
        for (int i = 0; i < points.length; i++)
        {
            if (i > 0 && points[i][0] == points[i - 1][0] && points[i][1] == points[i - 1][1])
            {
                continue;
            }
            if (points[i][reflectionIndex] < 0)
            {
                stackPoints.add(points[i]);
            }
            else if (points[i][reflectionIndex] > 0)
            {
                if (stackPoints.isEmpty())
                {
                    return false;
                }
                int[] reflection = stackPoints.peek();
                if (reflection[reflectionIndex] == (points[i][reflectionIndex] * -1) && reflection[nonReflectionIndex] == points[i][nonReflectionIndex])
                {
                    stackPoints.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        return stackPoints.isEmpty();
    }

}
