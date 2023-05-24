package org.example;

import java.util.List;
import java.util.stream.Stream;

import org.example.utils.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BinaryTreeLevelOrderTraversalImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(TreeNode tree)
    {
        List<List<Integer>> actualResult = BinaryTreeLevelOrderTraversalImpl.levelOrder(tree);
        System.out.print("\n");
        for (final List<Integer> integers : actualResult)
        {
            System.out.printf("%s,", integers);
        }
    }

    private static Stream<Arguments> provideTestData()
    {
        TreeNode node_4 = new TreeNode(4);
        TreeNode node_3 = new TreeNode(3);
        TreeNode node_2 = new TreeNode(2, node_3, node_4);
        TreeNode node_1 = new TreeNode(1);
        TreeNode root = new TreeNode(0, node_1, node_2);

        TreeNode singleRoot = new TreeNode(0);

        return Stream.of(
                Arguments.of(root),
                Arguments.of(singleRoot)
        );
    }

}