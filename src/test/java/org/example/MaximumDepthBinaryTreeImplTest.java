package org.example;

import java.util.stream.Stream;

import org.example.utils.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthBinaryTreeImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(TreeNode tree, int expectedResult)
    {
        int actualResult = MaximumDepthBinaryTreeImpl.maxDepth(tree);
        assertEquals(expectedResult, actualResult);
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
                Arguments.of(root, 3),
                Arguments.of(singleRoot, 1),
                Arguments.of(null, 0)
        );
    }

}