package org.example;

import java.util.stream.Stream;

import org.example.utils.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PalindromeLinkedListImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(ListNode list)
    {
        // int[] array = new int[] {8,0,7,1,7,7,9,7,5,2,9,1,7,3,7,0,6,5,1,7,7,9,3,8,1,5,7,7,8,4,0,9,3,7,3,4,5,7,4,8,8,5,8,9,8,5,8,8,4,7,5,4,3,7,3,9,0,4,8,7,7,5,1,8,3,9,7,7,1,5,6,0,7,3,7,1,9,2,5,7,9,7,7,1,7,0,8};
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        ListNode listNode = getListFromArray(array);

        boolean actualResult = PalindromeLinkedListImpl.isPalindrome(listNode);
        System.out.printf("\nPalindrome: %s, ", actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        ListNode first_node_5 = new ListNode(1);
        ListNode first_node_4 = new ListNode(2, first_node_5);
        ListNode first_node_3 = new ListNode(3, first_node_4);
        ListNode first_node_2 = new ListNode(1, first_node_3);
        ListNode list = new ListNode(1, first_node_2);

        return Stream.of(
                Arguments.of(list)
        );
    }

    private static ListNode getListFromArray(int[] array)
    {
        ListNode iterator = new ListNode(array[0]);
        ListNode head = iterator;
        for (int i = 1; i < array.length; i++)
        {
            ListNode next = new ListNode(array[i]);
            iterator.setNext(next);
            iterator = iterator.next;
        }
        return head;
    }

}