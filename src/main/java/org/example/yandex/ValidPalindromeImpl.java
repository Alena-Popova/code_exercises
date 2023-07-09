package org.example.yandex;

public class ValidPalindromeImpl
{
    public static boolean validPalindrome(String s)
    {
        char[] letters = s.toCharArray();
        boolean skipOne = false;
        int reflectionIndex = letters.length - 1;
        int middlePoint = letters.length / 2;

        for (int i = 0; i < middlePoint; i++)
        {

            if (letters[i] != letters[reflectionIndex])
            {
                if (skipOne == false)
                {
                     if (i < middlePoint && letters[i + 1] == letters[reflectionIndex])
                    {
                        middlePoint++;
                        i++;
                        skipOne = true;
                    }
                    else if (reflectionIndex > middlePoint && letters[i] == letters[reflectionIndex - 1])
                    {
                        middlePoint--;
                        reflectionIndex--;
                        skipOne = true;
                    }
                    else return i == middlePoint - 1 && reflectionIndex == middlePoint;
                }
                else
                {
                    return false;
                }
            }
            reflectionIndex--;
        }
        return true;
    }
}
