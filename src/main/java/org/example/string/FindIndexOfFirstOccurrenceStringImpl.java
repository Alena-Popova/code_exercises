package org.example.string;

/**
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 * Find the Index of the First Occurrence in a String
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 */
public class FindIndexOfFirstOccurrenceStringImpl
{

    /**
     * (by indexOf)
     * Constraints:
     * 1 <= haystack.length, needle.length <= 104
     * haystack and needle consist of only lowercase English characters.
     */
    public static int strStr(String haystack, String needle)
    {
        if (haystack == null || needle == null || haystack.isEmpty() || needle.isEmpty() || haystack.length() < needle.length())
        {
            return -1;
        }
        return haystack.indexOf(needle);
    }

    public static int strStrByCycle(String haystack, String needle)
    {
        if (haystack == null || needle == null || haystack.isEmpty() || needle.isEmpty() || haystack.length() < needle.length())
        {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            for(int j = 0; j < needle.length(); j++) {
                if(haystack.charAt(i) != needle.charAt(j)) {
                    i--;
                    break;
                } else if (j == needle.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }

}
