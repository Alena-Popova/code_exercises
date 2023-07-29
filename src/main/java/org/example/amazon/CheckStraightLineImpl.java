package org.example.amazon;

/**
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.
 */
public class CheckStraightLineImpl
{
    /**
     * Constraints:
     * <p>
     * 2 <= coordinates.length <= 1000
     * coordinates[i].length == 2
     * -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
     * coordinates contains no duplicate point.
     */
    public static boolean checkStraightLine(int[][] coordinates)
    {
        for (int i = 2; i < coordinates.length; i++)
        {
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            boolean isCurve = (x - coordinates[1][0]) * (coordinates[1][1] - coordinates[0][1]) != (y - coordinates[1][1]) * (coordinates[1][0] - coordinates[0][0]);
            if (isCurve)
            {
                return false;
            }
        }
        return true;
    }
}
