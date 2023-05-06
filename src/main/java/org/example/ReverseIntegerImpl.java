package org.example;

public class ReverseIntegerImpl
{

    /**
     * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
     * -231 <= x <= 231 - 1
     */
    public static String execute(Integer x)
    {
        final boolean isPositive = x >= 0;
        final Integer absValue = Math.abs(x);
        if (absValue <= 9)
        {
            return getNumberFormat(isPositive, String.valueOf(absValue));
        }
        char[] array = String.valueOf(absValue).toCharArray();
        int length = array.length;
        for (int i = 0; i < length / 2; i++)
        {
            char temp = array[length - i - 1];
            array[length - i - 1] = array[i];
            array[i] = temp;
        }
        return getNumberFormat(isPositive, String.valueOf(array));
    }

    private static String getNumberFormat(boolean isPositive, String number)
    {
        return isPositive ? number : "-" + number;
    }
}
