package org.example;

public class PlusOneImpl
{

    public static int[] execute(int[] digits)
    {
        final int length = digits.length;
        if (length == 0)
        {
            return digits;
        }
        for (int i = length - 1; i >= 0; i--)
        {
            if (digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[length + 1];
        result[0] = 1;
        System.arraycopy(digits, 0, result, 1, length);
        return result;
    }
}
