package org.example.yandex;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Robot Return to Origin
 * https://leetcode.com/problems/robot-return-to-origin/
 * There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
 * You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).
 * Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.
 * Note: The way that the robot is "facing" is irrelevant. 'R' will always make the robot move to the right once, 'L' will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.
 */
public class RobotReturnToOriginImpl
{
    /**
     * Constraints:
     * 1 <= moves.length <= 2 * 104
     * moves only contains the characters 'U', 'D', 'L' and 'R'.
     */
    public static boolean judgeCircle(String moves)
    {
        if (moves == null || moves.isBlank())
        {
            return false;
        }
        Map<Character, Long> action = moves.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Long up = action.getOrDefault('U', 0L);
        Long down = action.getOrDefault('D', 0L);
        Long left = action.getOrDefault('L', 0L);
        Long right = action.getOrDefault('R', 0L);

        return up.compareTo(down) == 0 && left.compareTo(right) == 0;
    }
}
