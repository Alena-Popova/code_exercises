package org.example;

import java.util.stream.Stream;

import org.example.utils.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListCycleImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(ListNode list, boolean expectedResult)
    {
        boolean actualResult = LinkedListCycleImpl.hasCycle(list);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        ListNode first_node_5 = new ListNode(10);
        ListNode first_node_4 = new ListNode(9, first_node_5);
        ListNode first_node_3 = new ListNode(6, first_node_4);
        ListNode first_node_2 = new ListNode(3, first_node_3);
        ListNode first = new ListNode(0, first_node_2);
        first_node_5.setNext(first);


        return Stream.of(
                Arguments.of(first, true)
        );
    }

}