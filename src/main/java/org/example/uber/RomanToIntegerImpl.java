package org.example.uber;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerImpl
{
    private static Map<Character, Integer> dictionary = new HashMap<>();

    static {
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);
    }

    public static int romanToInt(String s)
    {
        int answer = 0;
        int previous = 0;

        for (int i = s.length() - 1; i >= 0; i--)
        {
            int num = dictionary.get(s.charAt(i));
            if (num < previous)
            {
                answer -= num;
            }
            else
            {
                answer += num;
            }
            previous = num;
        }
        return answer;
    }
}
