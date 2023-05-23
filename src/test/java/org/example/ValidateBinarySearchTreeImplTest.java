package org.example;

import java.util.stream.Stream;

import org.example.utils.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidateBinarySearchTreeImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(TreeNode tree, boolean expectedResult)
    {
        boolean actualResult = ValidateBinarySearchTreeImpl.isValidBST(tree);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        TreeNode bstRoot_9 = new TreeNode(9);
        TreeNode bstRoot_6 = new TreeNode(6);
        TreeNode bstRoot_7 = new TreeNode(7, bstRoot_6, bstRoot_9);
        TreeNode bstRoot_1 = new TreeNode(1);
        TreeNode bstRoot = new TreeNode(5, bstRoot_1, bstRoot_7);

        TreeNode node_4 = new TreeNode(4);
        TreeNode node_3 = new TreeNode(3);
        TreeNode node_2 = new TreeNode(2, node_3, node_4);
        TreeNode node_1 = new TreeNode(1);
        TreeNode root = new TreeNode(0, node_1, node_2);

        TreeNode singleRoot = new TreeNode(0);

        return Stream.of(
                Arguments.of(root, false),
                Arguments.of(bstRoot, true),
                Arguments.of(singleRoot, true),
                Arguments.of(null, true)
        );
    }

}