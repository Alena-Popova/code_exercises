package org.example.tree;

import java.util.stream.Stream;

import org.example.utils.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PathSumImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(TreeNode root, int targetSum, boolean expectedResult)
    {
        boolean actualResult = PathSumImpl.hasPathSum(root, targetSum);
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
                Arguments.of(root, 5, true),
                Arguments.of(root, 2, false),
                Arguments.of(singleRoot, 1, false),
                Arguments.of(null, 0, false)
        );
    }

}