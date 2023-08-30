package org.example.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
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
        put(8, Arrays.asList('t', 'u', 'v'));
        put(9, Arrays.asList('w', 'x', 'y', 'z'));
    }};

    public static List<String> letterCombinations(String digits)
    {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty())
        {
            return result;
        }
        backtracking(result, "", digits, 0);
        return result;
    }

    private static void backtracking(List<String> results, String current, String digits, int cursor)
    {
        if (cursor >= digits.length())
        {
            if (!current.isEmpty())
            {
                results.add(current);
            }
            return;
        }

        Integer currentNumber = Character.getNumericValue(digits.charAt(cursor));
        if (currentNumber == 1)
        {
            backtracking(results, current, digits, ++cursor);
        }
        else
        {
            for (Character letter : digitToLetters.getOrDefault(currentNumber, Collections.emptyList()))
            {
                backtracking(results, current + letter, digits, cursor + 1);
            }
        }
    }
}
