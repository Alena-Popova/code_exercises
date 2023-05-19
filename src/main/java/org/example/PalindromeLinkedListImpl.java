package org.example;

import org.example.utils.ListNode;

public class PalindromeLinkedListImpl
{

    public static boolean isPalindrome(ListNode head)
    {
        if (head == null || head.next == null)
        {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode previous = slow;
        slow = slow.next;
        previous.next = null;
        while (slow != null)
        {
            ListNode temp = slow.next;
            slow.next = previous;
            previous = slow;
            slow = temp;
        }
        fast = head;
        slow = previous;

        print(slow, "slow");
        print(fast, "fast");

        while (slow != null)
        {
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }


    private static void print(ListNode list, String marker)
    {
        ListNode copy = list;
        System.out.printf("\n%s:", marker);
        while (copy != null)
        {
            System.out.printf("%s, ", copy.val);
            copy = copy.next;
        }
    }


}
