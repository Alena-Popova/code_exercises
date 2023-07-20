package org.example.yandex;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s and an integer k, return the length of the longest substring
 * of s that contains at most k distinct characters.
 */
public class LongestSubstringWithAtMostKDistinctCharactersImpl
{

    /**
     * 1 <= s.length <= 5 * 104
     * 0 <= k <= 50
     */
    public static int lengthOfLongestSubstringKDistinct(String s, int k)
    {
        if (k == 0)
        {
            return 0;
        }
        Set<Character> bank;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++)
        {
            bank = new HashSet<>();
            int length = 0;
            for (int j = i; j < s.length(); j++)
            {
                char letter = s.charAt(j);
                if (bank.contains(letter))
                {
                    length++;
                }
                else
                {
                    if (bank.size() == k)
                    {
                        break;
                    }
                    else
                    {
                        bank.add(letter);
                        length++;

                    }
                }
                if (length > maxLength)
                {
                    maxLength = length;
                }
                if (j == s.length() - 1)
                {
                    return maxLength;
                }
            }
        }
        return maxLength;
    }
}
