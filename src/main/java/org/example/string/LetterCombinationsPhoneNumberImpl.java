package org.example.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 * <p>
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 */
public class LetterCombinationsPhoneNumberImpl
{
    private final static Map<Integer, List<Character>> digitToLetters = new HashMap<>()
    {{
        put(2, Arrays.asList('a', 'b', 'c'));
        put(3, Arrays.asList('d', 'e', 'f'));
        put(4, Arrays.asList('g', 'h', 'i'));
        put(5, Arrays.asList('j', 'k', 'l'));
        put(6, Arrays.asList('m', 'n', 'o'));
        put(7, Arrays.asList('p', 'q', 'r', 's'));
        put(8, Arrays.asList('t', 'u', 'w'));
        put(9, Arrays.asList('w', 'x', 'y', 'z'));
    }};

    public static List<String> letterCombinations(String digits)
    {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty())
        {
            return result;
        }
        List<Integer> pointer = Collections.nCopies(digits.length(), 0);
        composeLetters(result, digits, pointer);
        return result;
    }

    private static void composeLetters(List<String> result, String digits, List<Integer> counters)
    {
        StringBuilder combination = new StringBuilder();
        for (int i = 0; i < counters.size(); i++)
        {
            int digit =  Character.getNumericValue(digits.charAt(i));
            List<Character> chars = digitToLetters.getOrDefault(digit, Collections.emptyList());
            if (!chars.isEmpty())
            {
                int position = counters.get(i);
                combination.append(chars.get(position));
            }
        }
        result.add(combination.toString());
    }
}
