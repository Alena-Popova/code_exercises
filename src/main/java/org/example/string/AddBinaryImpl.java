package org.example.string;

/**
 * https://leetcode.com/problems/add-binary/
 * Add Binary
 * Given two binary strings a and b, return their sum as a binary string.
 */
public class AddBinaryImpl
{
    /**
     * Constraints:
     * 1 <= a.length, b.length <= 104
     * a and b consist only of '0' or '1' characters.
     * Each string does not contain leading zeros except for the zero itself.
     */
    public static String addBinary(String a, String b)
    {
        StringBuilder result = new StringBuilder();
        boolean aIsBigger = a.length() > b.length();
        String max = aIsBigger ? a : b;
        String min = aIsBigger ? b : a;
        int firstIndex = max.length() - 1;
        int secondIndex = min.length() - 1;
        int carry = 0;

        while (firstIndex >= 0 || secondIndex >= 0 || carry > 0)
        {
            int first = firstIndex >= 0 ? Character.getNumericValue(max.charAt(firstIndex)) : 0;
            int second = secondIndex >= 0 ? Character.getNumericValue(min.charAt(secondIndex)) : 0;
            if (first + second == 2)
            {
                if (carry != 0)
                {
                    result.append('1');
                }
                else
                {
                    carry++;
                    result.append('0');
                }
            }
            else if (carry != 0)
            {
                if (first + second == 1) {
                    result.append('0');
                } else {
                    result.append('1');
                    carry--;
                }
            }
            else
            {
                result.append(first + second);
            }
            firstIndex--;
            secondIndex--;
        }
        return result.reverse().toString();
    }
}
