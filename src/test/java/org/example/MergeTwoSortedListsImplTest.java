package org.example;

import java.util.stream.Stream;

import org.example.utils.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MergeTwoSortedListsImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(ListNode first, ListNode second)
    {
        ListNode actualResult = MergeTwoSortedListsImpl.mergeTwoLists(first, second);
        while (actualResult != null)
        {
            System.out.printf("%s, ", actualResult.val);
            actualResult = actualResult.next;
        }
    }

    private static Stream<Arguments> provideTestData()
    {
        ListNode first_node_5 = new ListNode(10);
        ListNode first_node_4 = new ListNode(9, first_node_5);
        ListNode first_node_3 = new ListNode(6, first_node_4);
        ListNode first_node_2 = new ListNode(3, first_node_3);
        ListNode first = new ListNode(0, first_node_2);

        ListNode second_node_5 = new ListNode(12);
        ListNode second_node_4 = new ListNode(8, second_node_5);
        ListNode second_node_3 = new ListNode(7, second_node_4);
        ListNode second_node_2 = new ListNode(2, second_node_3);
        ListNode second = new ListNode(1, second_node_2);

        ListNode therd = new ListNode(1);

        return Stream.of(
               // Arguments.of(first, second),
                Arguments.of(first, therd)
        );
    }

}