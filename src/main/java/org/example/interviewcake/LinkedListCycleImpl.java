package org.example.interviewcake;

import org.example.utils.ListNode;

public class LinkedListCycleImpl
{


    public static boolean haveACycle(ListNode head)
    {
        if (head == null || head.next == null)
        {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
            {
                return true;
            }
        }
        return false;
    }

    // url, key world, last upt time.

    // links inside different page can repeated (http:web1.com, http:web2.com)

    // http:web1.com -> key world + links in the page -> inst, tw, wa
    // http:web2.com -> key world + links in the page -> inst, tw
    // http:web3.com -> key world + links in the page -> inst, tw, wa
    // http:web4.com -> key world + links in the page -> inst, tw, wa, hbo tv
}
