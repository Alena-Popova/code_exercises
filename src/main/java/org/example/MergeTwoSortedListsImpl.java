package org.example;

import org.example.utils.ListNode;

public class MergeTwoSortedListsImpl
{
    /**
     *
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        if (list2 == null) {
            return list1;
        }
        if (list1 == null) {
            return list2;
        }
        ListNode iterator = list1.val < list2.val ? list1 : list2;
        ListNode head = iterator;
        ListNode lastPointer = list1.val < list2.val ? list2 : list1;
        while (iterator != null)
        {
           /* System.out.printf("Iterator on {%s}, last pointer on {%s}, iterator.next on {%s}\n", iterator.val,
                    lastPointer == null ? "is null" : String.valueOf(lastPointer.val),
                    iterator.next == null ? "is null" : String.valueOf(iterator.next.val));*/
            if (iterator.next == null && lastPointer == null)
            {
                return head;
            }

            if (iterator.next == null)
            {
                iterator.next = lastPointer;
                lastPointer = null;
            }
            else if (lastPointer == null)
            {
                iterator = iterator.next;
            }
            else if (lastPointer.val < iterator.next.val)
            {
                ListNode temp = iterator.next;
                iterator.next = lastPointer;
                lastPointer = temp;
            }
            else
            {
                iterator = iterator.next;
            }
        }
        return head;
    }
}
