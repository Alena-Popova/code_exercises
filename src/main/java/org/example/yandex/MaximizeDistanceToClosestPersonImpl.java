package org.example.yandex;

/**
 * You are given an array representing a row of seats where seats[i] = 1 represents a person sitting in the ith seat, and seats[i] = 0 represents that the ith seat is empty (0-indexed).
 * There is at least one empty seat, and at least one person sitting.
 * Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized.
 * Return that maximum distance to the closest person.
 */
public class MaximizeDistanceToClosestPersonImpl
{

    /**
     * 2 <= seats.length <= 2 * 104
     * seats[i] is 0 or 1.
     * At least one seat is empty.
     * At least one seat is occupied.
     */
    public static int maxDistToClosest(int[] seats)
    {
        final int length = seats.length;
        if (length == 2)
        {
            return 1;
        }

        int maxEmptySpace = 0;
        for (int i = 0; i < length; i++)
        {
            if (seats[i] == 0)
            {
                for (int j = i + 1; j < length; j++)
                {
                    boolean isEnd = j == length - 1;
                    if (seats[j] == 1 || isEnd)
                    {
                        int gap = j - i;
                        if ((seats[j] == 0 && isEnd))
                        {
                            return gap + 1;
                        }
                        int interval = i == 0
                                ? gap
                                : (gap / 2) + 1;
                        maxEmptySpace = Math.max(maxEmptySpace, interval);
                        i = j;
                        break;
                    }
                }
            }
        }
        return maxEmptySpace;
    }
}
