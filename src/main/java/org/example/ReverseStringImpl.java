package org.example;

public class ReverseStringImpl
{

    /**
     * Write a function that reverses a string. The input string is given as an array of characters s.
     * You must do this by modifying the input array in-place with O(1) extra memory.
     * 1 <= s.length <= 105
     * s[i] is a printable ascii character.
     */
    public static char[] reverseString(char[] s)
    {
        final int length = s.length;
        if (length <= 1)
        {
            return s;
        }
        for (int i = 0; i < length / 2; i++)
        {
            int reflectedIndex = length - i - 1;
            char temp = s[reflectedIndex];
            s[reflectedIndex] = s[i];
            s[i] = temp;
        }
        return s;
    }
}
