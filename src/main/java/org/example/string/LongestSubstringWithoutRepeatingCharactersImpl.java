package org.example.string;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharactersImpl
{

    /**
     * Constraints:
     * <p>
     * 0 <= s.length <= 5 * 104
     * s consists of English letters, digits, symbols and spaces.
     */
    public static int lengthOfLongestSubstring(String s)
    {
        int max = 0;
        if (s == null)
        {
            return max;
        }
        final int length = s.length();
        for (int i = 0; i < length; i++)
        {
            List<Character> piece = new ArrayList<>();
            for (int j = i; j < length; j++)
            {
                if (piece.contains(s.charAt(j)))
                {
                    max = Math.max(max, piece.size());
                    break;
                }
                else
                {
                    piece.add(s.charAt(j));
                    if(j == length - 1) {
                        return Math.max(max, piece.size());
                    }
                }
            }
        }
        return max;
    }
}
