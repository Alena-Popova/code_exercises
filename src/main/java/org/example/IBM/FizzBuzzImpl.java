package org.example.IBM;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/fizz-buzz/
 * Given an integer n, return a string array answer (1-indexed) where:
 *
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 */
public class FizzBuzzImpl
{
    public List<String> fizzBuzz(int n)
    {
        return IntStream.rangeClosed(0, n)
                .mapToObj(this::getFizzBuzz)
                .collect(Collectors.toList());
    }

    public String getFizzBuzz(int i)
    {
        if (i % 5 == 0 && i % 3 == 0)
        {
            return "FizzBuzz";
        }
        else if (i % 5 == 0)
        {
            return "Buzz";
        }
        else if (i % 3 == 0)
        {
            return "Fizz";
        }
        else
        {
            return String.valueOf(i);
        }
    }
}
