package org.example;

import java.util.stream.Stream;

import org.example.utils.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RemoveNodeFromEndListImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(ListNode head)
    {
        ListNode actualResult = RemoveNodeFromEndListImpl.removeNthFromEnd(head, 2);
        while (actualResult != null)
        {
            System.out.printf("%s, ", actualResult.val);
            actualResult = actualResult.next;
        }
    }

    private static Stream<Arguments> provideTestData()
    {
        ListNode node_5 = new ListNode(5);
        ListNode node_4 = new ListNode(4, node_5);
        ListNode node_3 = new ListNode(3, node_4);
        ListNode node_2 = new ListNode(2, node_3);
        ListNode head = new ListNode(1, node_2);

        return Stream.of(
                Arguments.of(head, 2)
        );
    }

}