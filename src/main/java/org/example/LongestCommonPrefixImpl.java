package org.example;

public class LongestCommonPrefixImpl
{

    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     * If there is no common prefix, return an empty string "".
     * 1 <= strs.length <= 200
     * 0 <= strs[i].length <= 200
     * strs[i] consists of only lowercase English letters.
     */
    public static String longestCommonPrefix(String[] strs)
    {
        int massiveLength = strs.length;
        if (massiveLength == 1)
        {
            return strs[0];
        }

        int minStrLength = strs[0].length();

        for (int i = 0; i < massiveLength; i++)
        {
            if (strs[i].length() < minStrLength)
            {
                minStrLength = strs[i].length();
            }
        }
        if (minStrLength == 0)
        {
            return "";
        }
        int prefixLength = 0;
        for (int i = 0; i < minStrLength; i++)
        {
            char symbolInPrefix = strs[0].charAt(i);
            for (int j = 0; j < massiveLength; j++)
            {
                if (strs[j].charAt(i) != symbolInPrefix)
                {
                    return prefixLength == 0 ? "" : strs[0].substring(0, prefixLength);
                }
            }
            prefixLength++;
        }
        return prefixLength == 0 ? "" : strs[0].substring(0, prefixLength);
    }
}
