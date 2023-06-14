package org.example.interviewcake;

public class PalindromeImpl
{

    public static boolean isPalindrome(String word)
    {
        if (word == null || word.length() == 1)
        {
            return true;
        }
        final int length = word.length();
        char[] charsArray = word.toCharArray();
        for (int i = 0; i < length / 2; i++)
        {
            if (charsArray[i] != charsArray[length - i - 1])
            {
                return false;
            }
        }
        return true;
    }
}
