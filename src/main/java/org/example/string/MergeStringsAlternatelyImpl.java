package org.example.string;

/**
 * https://leetcode.com/problems/merge-strings-alternately/description/
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 * Return the merged string.
 */
public class MergeStringsAlternatelyImpl
{

    /**
     * Constraints:
     * 1 <= word1.length, word2.length <= 100
     * word1 and word2 consist of lowercase English letters.
     */
    public static String mergeAlternately(String word1, String word2)
    {
        StringBuilder result = new StringBuilder();
        int firstIterator = 0;
        int secondIterator = 0;
        while (result.length() < word1.length() + word2.length())
        {
            if (firstIterator < word1.length())
            {
                result.append(word1.charAt(firstIterator));
                firstIterator++;
            }
            if (secondIterator < word2.length())
            {
                result.append(word2.charAt(secondIterator));
                secondIterator++;
            }
        }
        return result.toString();
    }
}
