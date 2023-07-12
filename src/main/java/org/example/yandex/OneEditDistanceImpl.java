package org.example.yandex;

/**
 * Given two strings s and t, return true if they are both one edit distance apart, otherwise return false.
 * <p>
 * A string s is said to be one distance apart from a string t if you can:
 * <p>
 * Insert exactly one character into s to get t.
 * Delete exactly one character from s to get t.
 * Replace exactly one character of s with a different character to get t.
 */
public class OneEditDistanceImpl
{
    /**
     * 0 <= s.length, t.length <= 104
     * s and t consist of lowercase letters, uppercase letters, and digits.
     */
    public static boolean isOneEditDistance(String s, String t)
    {
        if (Math.abs(s.length() - t.length()) > 1)
        {
            return false;
        }
        boolean isFirstBigger = s.length() > t.length();
        String longest = isFirstBigger ? s : t;
        String smallest = isFirstBigger ? t : s;

        boolean wasReplace = false;
        boolean sameLength = longest.length() == smallest.length();
        int firstIter = 0;
        int secondIter = 0;

        while (firstIter < longest.length() || secondIter < smallest.length())
        {
            if (!sameLength && secondIter == smallest.length()) {
                return !wasReplace;
            }
            if (longest.charAt(firstIter) != smallest.charAt(secondIter))
            {
                if (wasReplace)
                {
                    return false;
                }
                wasReplace = true;
                firstIter++;
                if (sameLength)
                {
                    secondIter++;
                }
            }
            else
            {
                firstIter++;
                secondIter++;
            }
        }
        return wasReplace;
    }
}
