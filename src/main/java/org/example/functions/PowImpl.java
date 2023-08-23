package org.example.functions;

/**
 * https://leetcode.com/problems/powx-n/
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 */
public class PowImpl
{

    /**
     * Constraints:
     * <p>
     * -100.0 < x < 100.0
     * -231 <= n <= 231-1
     * n is an integer.
     * Either x is not zero or n > 0.
     * -104 <= xn <= 104
     */
    public static double myPow(double x, int n)
    {
        if (n == 0)
        {
            return 1d;
        }
        if (n < 0)
        {
            return 1 / myPow(x, -n);
        }
        if (n % 2 == 0)
        {
            return myPow(x * x, n / 2);
        }
        else
        {
            return x * myPow(x * x, (n - 1) / 2);
        }
    }

}
