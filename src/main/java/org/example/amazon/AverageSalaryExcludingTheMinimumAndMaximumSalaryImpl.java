package org.example.amazon;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 * You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
 * Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.
 */
public class AverageSalaryExcludingTheMinimumAndMaximumSalaryImpl
{
    /**
     * 3 <= salary.length <= 100
     * 1000 <= salary[i] <= 106
     * All the integers of salary are unique.
     */
    public static double average(int[] salary)
    {
        Arrays.sort(salary);
        if (salary.length > 3)
        {
            return Arrays.stream(salary)
                    .skip(1)
                    .limit(salary.length - 2)
                    .average()
                    .orElseThrow();
        }
        else
        {
            return salary[1];
        }

    }
}
