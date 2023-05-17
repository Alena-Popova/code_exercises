package org.example;

import org.example.utils.ListNode;

public class ReverseLinkedListImpl
{
    /**
     * Given the head of a singly linked list, reverse the list, and return the reversed list.
     */
    public ListNode reverseList(ListNode head)
    {
        if (head == null) {
            return null;
        }
        ListNode previousOne = null;
        ListNode iterator = head;
        while (iterator != null)
        {
            ListNode next = iterator.next;
            iterator.next = previousOne;
            previousOne = iterator;
            iterator = next;
        }
        return previousOne;
    }
}
