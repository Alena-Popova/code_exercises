package org.example.IBM;

/**
 * https://leetcode.com/problems/find-the-difference/description/
 * You are given two strings s and t.
 * <p>
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * <p>
 * Return the letter that was added to t.
 */
public class FindTheDifferenceImpl
{
    /**
     * Constraints:
     * 0 <= s.length <= 1000
     * t.length == s.length + 1
     * s and t consist of lowercase English letters.
     */
    public static char findTheDifference(String s, String t)
    {
        int[] bankLetters = new int[26];
        for (int i = 0; i < t.length(); i++)
        {
            if (i < s.length()) {
                int index_1 =  s.charAt(i) - 'a';
                bankLetters[index_1]++;
            }
            int index_2 =  t.charAt(i) - 'a';
            bankLetters[index_2]--;
        }
        for(int i = 0; i < bankLetters.length; i ++) {
            if (bankLetters[i] != 0) {
                return (char) (i + 'a');
            }
        }
        throw new IllegalStateException("Incoming values do not satisfy the task condition, the answer is not found");
    }
}
