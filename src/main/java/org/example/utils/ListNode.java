package org.example.utils;

import org.example.DeleteNodeInLinkedListImpl;

public class ListNode
{
    public int val;
    public ListNode next;

    public ListNode()
    {
    }

    public ListNode(int x)
    {
        val = x;
    }

    public ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
