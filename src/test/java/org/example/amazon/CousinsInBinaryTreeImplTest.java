package org.example.amazon;

import java.util.stream.Stream;

import org.example.utils.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CousinsInBinaryTreeImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(TreeNode root, int x, int y, boolean expectedResult)
    {
        boolean actualResult = CousinsInBinaryTreeImpl.isCousins(root, x, y);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        TreeNode node_4 = new TreeNode(5);
        TreeNode node_3 = new TreeNode(4);
        TreeNode node_2 = new TreeNode(3, null, node_4);
        TreeNode node_1 = new TreeNode(2, node_3, null);
        TreeNode root = new TreeNode(1, node_1, node_2);

        return Stream.of(
                Arguments.of(root, 4, 5, true)
        );
    }

}