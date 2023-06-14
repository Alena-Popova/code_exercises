package org.example.interviewcake;

public class RotatedPointImpl
{

    public static int getRotatedPoint(String[] words)
    {
        if (words.length <= 1) {
            return -1;
        }

        char lastOne = words[0].toCharArray()[0];
        for (int i = 1; i < words.length; i ++) {
            if (lastOne - words[i].toCharArray()[0] > 0) {
                return i;
            }
        }
        return -1;
    }
}
