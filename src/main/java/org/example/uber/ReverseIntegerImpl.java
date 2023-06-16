package org.example.uber;

import java.util.Arrays;

public class ReverseIntegerImpl
{
    public static int reverse(int x)
    {
        char[] intValue = String.valueOf(x).toCharArray();
        boolean isNegative = intValue[0] == '-';
        int length = intValue.length;
        if (isNegative)
        {
            intValue = Arrays.copyOfRange(intValue, 1, length);
            length -= 1;
        }

        for (int i = 0; i < length / 2; i++)
        {
            int reflectionIndex = length - i - 1;
            char temp = intValue[i];
            intValue[i] = intValue[reflectionIndex];
            intValue[reflectionIndex] = temp;
        }
        int result = Integer.parseInt(String.valueOf(intValue));
        return isNegative ? -1 * result : result;
    }

    public static int reverse_2(int x)
    {
        long finalNum = 0;
        while (x != 0)
        {
            int lastDig = x % 10;
            finalNum += lastDig;
            if (Math.abs(x) >= 10)
            {
                finalNum = finalNum * 10;
            }
            x = x / 10;
        }
        if (finalNum > Integer.MAX_VALUE || finalNum < Integer.MIN_VALUE)
        {
            return 0;
        }
        if (x < 0)
        {
            return (int) (-1 * finalNum);
        }
        return (int) finalNum;
    }
}
