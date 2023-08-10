package org.example.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 */
public class GenerateParenthesesImpl
{

    /**
     * Constraints:
     * <p>
     * 1 <= n <= 8
     */
    public static List<String> generateParenthesis(int n)
    {
        List<String> results = new ArrayList<>();
        generateValidParenthesis(results, 0, 0, "", n);
        return results;
    }

    private static void generateValidParenthesis(List<String> results, int openBracketsAmount, int closeBracketsAmount, String str, int n)
    {
        if (str.length() == n * 2)
        {
            results.add(str);
            return;
        }
        if (openBracketsAmount < n)
        {
            generateValidParenthesis(results, openBracketsAmount + 1, closeBracketsAmount, str + "(", n);
        }
        if (closeBracketsAmount < openBracketsAmount)
        {
            generateValidParenthesis(results, openBracketsAmount, closeBracketsAmount + 1, str + ")", n);
        }
    }
}
