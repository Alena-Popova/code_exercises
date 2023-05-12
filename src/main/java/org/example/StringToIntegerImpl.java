package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToIntegerImpl
{

    public static int myAtoi(String s)
    {
        int length = s.length();
        if (length == 0)
        {
            return 0;
        }
        String withoutSpaces = s.replaceFirst("^\\s+", "");
        boolean isNegative = withoutSpaces.startsWith("-");
        if (isNegative && withoutSpaces.length() >= 2)
        {
            if (!Character.isDigit(withoutSpaces.charAt(1)))
            {
                return 0;
            }
        }
        else if (!isNegative && withoutSpaces.length() >= 1)
        {
            if (!Character.isDigit(withoutSpaces.charAt(0)))
            {
                return 0;
            }
        }

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(withoutSpaces);
        if (matcher.find())
        {
            String resultString = matcher.group();
            return isNegative
                    ? Integer.parseInt("-" + resultString)
                    : Integer.parseInt(resultString);
        }
        else
        {
            return 0;
        }

    }
}
