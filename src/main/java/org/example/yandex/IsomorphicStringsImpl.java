package org.example.yandex;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/isomorphic-strings/description/
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 */
public class IsomorphicStringsImpl
{

    /**
     * Constraints:
     * 1 <= s.length <= 5 * 104
     * t.length == s.length
     * s and t consist of any valid ascii character.
     */
    public static boolean isIsomorphic(String s, String t)
    {
        Map<Character, Character> isomorphicDictionary = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
        {
            if (isomorphicDictionary.containsKey(s.charAt(i)))
            {
                if (isomorphicDictionary.get(s.charAt(i)).compareTo(t.charAt(i)) != 0)
                {
                    return false;
                }
            }
            else
            {
                if(!isomorphicDictionary.containsValue(t.charAt(i))) {
                    isomorphicDictionary.put(s.charAt(i), t.charAt(i));
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
