package org.example.interviewcake;

public class FibonacciNumber
{

    public static int fib(final int index)
    {
        if (index < 0)
        {
            throw new RuntimeException("Index cant be negative");
        }
        if (index <= 1)
        {
            return index;
        }
        int first = 0;
        int second = 1;
        for (int i = 2; i <= index; i++)
        {
            int temp = first;
            first = second;
            second = first + temp;
        }
        return second;
    }
}
