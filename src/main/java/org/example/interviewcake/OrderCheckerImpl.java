package org.example.interviewcake;

public class OrderCheckerImpl
{

    public static boolean checkOrder(int[] takeOutOrders, int[] dinnerInOrder, int[] kitchen)
    {
        final int takeOutLength = takeOutOrders.length;
        final int dinnerInLength = dinnerInOrder.length;
        int takeOutIterator = 0;
        int dineInIterator = 0;
        for (int i = 0; i < kitchen.length; i++)
        {
            if (takeOutIterator < takeOutLength && kitchen[i] == takeOutOrders[takeOutIterator])
            {
                takeOutIterator++;
            }
            else if (dineInIterator < dinnerInLength && kitchen[i] == dinnerInOrder[dineInIterator])
            {
                dineInIterator++;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
