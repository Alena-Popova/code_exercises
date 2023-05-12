package org.example;

public class ValidAnagramImpl
{

    /**
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
     */
    public static boolean isAnagram(String s, String t)
    {
        if (s.length() != t.length())
        {
            return false;
        }
        int[] alphabetBank = new int[26];
        for (int i = 0; i < s.length(); i++)
        {
            alphabetBank[s.charAt(i) - 'a']++;
            alphabetBank[t.charAt(i) - 'a']--;
        }
        for (final int j : alphabetBank)
        {
            if (j != 0)
            {
                return false;
            }
        }
        return true;
    }
}
