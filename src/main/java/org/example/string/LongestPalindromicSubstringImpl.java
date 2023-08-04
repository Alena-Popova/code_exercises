package org.example.string;

/**
 * Longest Palindromic Substring
 * https://leetcode.com/problems/longest-palindromic-substring/
 * Given a string s, return the longest palindromic substring in s.
 */
public class LongestPalindromicSubstringImpl
{

    /**
     * Constraints:
     * <p>
     * 1 <= s.length <= 1000
     * s consist of only digits and English letters.
     */
    public static String longestPalindrome(String s)
    {
        if (s == null || s.isBlank())
        {
            return "";
        }
        String longestPalindrome = "";

        for (int i = 0; i < s.length() - 1; i++)
        {
            String pldr = getPalindrome(s, i);
            if (pldr.length() > longestPalindrome.length())
            {
                longestPalindrome = pldr;
            }
        }
        return longestPalindrome.isEmpty()
                ? s.substring(0, 1)
                : longestPalindrome;
    }

    public static String getPalindrome(String s, int start)
    {
        for (int i = s.length() - 1; i > start; i--)
        {
            final String substring = s.substring(start, i + 1);
            if (s.charAt(i) == s.charAt(start) && isPalindrome(substring))
            {
                return substring;
            }
        }
        return "";
    }

    public static boolean isPalindrome(String s)
    {
        for (int i = 0; i < s.length() / 2; i++)
        {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
            {
                return false;
            }
        }
        return true;
    }
}
