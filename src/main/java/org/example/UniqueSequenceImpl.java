package org.example;

public class UniqueSequenceImpl
{

    /**
     * Must find unique sequence in str
     * only alphabetic characters in a string
     */
    public static String uniqSequence(String s)
    {
        String lastSequence = "";
        int length = s.length();
        int[] alphabeticBank = new int[26];
        for (int i = 0; i < length; i++)
        {
            for (int j = i; j < length; j++)
            {
                int index = s.charAt(j) - 'a';
                alphabeticBank[index]++;
                if (alphabeticBank[index] > 1)
                {
                    if (j - i > lastSequence.length())
                    {
                        lastSequence = s.substring(i, j);
                    }
                    alphabeticBank = new int[26];
                    break;
                }
                else if (j == length - 1 && j - i > lastSequence.length())
                {
                    lastSequence = s.substring(i);
                }
            }
        }
        return lastSequence;
    }
}
