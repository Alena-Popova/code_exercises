package org.example;

public class DeleteNodeInLinkedListImpl
{

    /**
     * There is a singly-linked list head and we want to delete a node node in it.
     * The number of the nodes in the given list is in the range [2, 1000].
     * -1000 <= Node.val <= 1000
     */
    public static void deleteNode(ListNode node)
    {
        node.val = node.next.val;
        node.next = node.next.next;
    }


    public static class ListNode
    {
        int val;
        ListNode next;

        ListNode(int x)
        {
            val = x;
        }
    }
}
