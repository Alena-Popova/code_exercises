package org.example;

import org.example.utils.ListNode;

public class RemoveNodeFromEndListImpl
{

    public static ListNode removeNthFromEnd(ListNode head, int n)
    {
        if (head == null)
        {
            return head;
        }
        int listSize = 0;
        ListNode iterator = head;
        while (iterator != null)
        {
            listSize++;
            iterator = iterator.next;
        }
        if (listSize == n) {
            head = head.next;
            return head;
        }
        int deleteIndex = listSize - n - 1;
        int count = 0;
        iterator = head;
        while (iterator != null)
        {
            if(deleteIndex == count) {
                iterator.next = iterator.next.next;
            }
            count++;
            iterator = iterator.next;
        }
        return head;
    }
}
