package org.example.interviewcake;

public class GetProductsImpl
{


    public static int[] getProductsOfAllIntsExceptAtIndex(int[] products)
    {
        if (products.length <= 1)
        {
            return products;
        }
        int limit = products.length;
        int result = products[0];
        for (int i = 1; i < products.length; i++)
        {
            if (result == 0)
            {
                products[i] = 0;
                limit = i;
            } else {
                result *= products[i];
            }
        }

        for (int i = 0; i < limit; i++)
        {
            if (result == 0)
            {
                products[i] = 0;
            }
            else if (products[i] != 1)
            {
                products[i] = result / products[i];
            }
            else
            {
                products[i] = result;
            }
        }
        return products;
    }
}
