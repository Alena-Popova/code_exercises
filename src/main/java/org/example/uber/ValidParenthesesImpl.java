package org.example.uber;

import java.util.Stack;

public class ValidParenthesesImpl
{
    public static boolean isValid(String s)
    {
        Stack<Character> order = new Stack<>();

        for (int i = 0; i < s.length(); i++)
        {
            char letter = s.charAt(i);
            if (letter == '{' || letter == '(' || letter == '[')
            {
                order.push(letter);
            }
            else
            {
                if (order.isEmpty())
                {
                    return false;
                }
                if (letter == '}' && order.peek() == '{')
                {
                    order.pop();
                }
                else if (letter == ')' && order.peek() == '(')
                {
                    order.pop();
                }
                else if (letter == ']' && order.peek() == '[')
                {
                    order.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        return order.isEmpty();
    }
}
