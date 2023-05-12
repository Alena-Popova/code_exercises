package org.example;

public class FirstUniqueCharacterImpl
{
    /**
     * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
     * 1 <= s.length <= 105
     * s consists of only lowercase English letters
     */
    public static int firstUniqChar(String s)
    {
        int length = s.length();
        if (length == 1)
        {
            return 0;
        }
        int[] symbolBank = new int[26];
        for (int i = 0; i < length; i++)
        {
            symbolBank[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < length; i++)
        {
            if (symbolBank[s.charAt(i) - 'a'] == 1)
            {
                return i;
            }
        }
        return -1;
    }

}
