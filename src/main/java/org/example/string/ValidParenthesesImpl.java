package org.example.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class ValidParenthesesImpl
{

    /**
     * Constraints:
     * <p>
     * 0 <= s.length <= 104
     * s consists of parentheses not only '()[]{}'.
     */
    public static boolean isValid(String s)
    {
        if (s == null)
        {
            return false;
        }
        Map<Character, Character> matches = new HashMap<>()
        {{
            put('}', '{');
            put(')', '(');
            put(']', '[');
        }};
        Set<Character> openBrackets = new HashSet<>(matches.values());
        Stack<Character> bracketsStack = new Stack<>();

        for (int i = 0; i < s.length(); i++)
        {
            char symbol = s.charAt(i);
            if (openBrackets.contains(symbol))
            {
                bracketsStack.add(symbol);
            }
            else if (matches.containsKey(symbol))
            {
                if (!bracketsStack.isEmpty() && matches.get(symbol).compareTo(bracketsStack.peek()) == 0)
                {
                    bracketsStack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        return bracketsStack.isEmpty();
    }
}
