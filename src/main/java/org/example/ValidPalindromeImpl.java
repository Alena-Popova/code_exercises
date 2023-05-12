package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPalindromeImpl
{

    /**
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
     * Given a string s, return true if it is a palindrome, or false otherwise.
     * 1 <= s.length <= 2 * 105
     * s consists only of printable ASCII characters
     */
    public static boolean isPalindrome(String s)
    {
        Pattern pattern = Pattern.compile("[^a-zA-Z1-9]");
        Matcher matcher = pattern.matcher(s);
        String validString = matcher.replaceAll("").toLowerCase();
        int length = validString.length();
        if (length <= 1)
        {
            return true;
        }
        for (int i = 0; i < length / 2; i++)
        {
            int reflectionIndex = length - 1 - i;
            if (validString.charAt(i) != validString.charAt(reflectionIndex))
            {
                return false;
            }
        }
        return true;
    }
}
