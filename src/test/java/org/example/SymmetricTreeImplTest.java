package org.example;

import java.util.stream.Stream;

import org.example.utils.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SymmetricTreeImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(TreeNode tree, boolean expectedResult)
    {
        boolean actualResult = SymmetricTreeImpl.isSymmetric(tree);
        assertEquals(expectedResult, actualResult);
    }

    //      0
//            2 - 2
//      3 - 4       4 - 3
//          5-6     5-6
    private static Stream<Arguments> provideTestData()
    {
        TreeNode node_non_symmetric_6_2 = new TreeNode(6);
        TreeNode node_non_symmetric_6_1 = new TreeNode(6);

        TreeNode node_non_symmetric_5_2 = new TreeNode(5);
        TreeNode node_non_symmetric_5_1 = new TreeNode(5);

        TreeNode node_non_symmetric_4_2 = new TreeNode(4, node_non_symmetric_5_2, node_non_symmetric_6_2);
        TreeNode node_non_symmetric_4_1 = new TreeNode(4, node_non_symmetric_5_1, node_non_symmetric_6_1);
        TreeNode node_non_symmetric_3_2 = new TreeNode(3);
        TreeNode node_non_symmetric_3_1 = new TreeNode(3);
        TreeNode node_non_symmetric_2_2 = new TreeNode(2, node_non_symmetric_4_2, node_non_symmetric_3_2);
        TreeNode node_non_symmetric_2_1 = new TreeNode(2, node_non_symmetric_3_1, node_non_symmetric_4_1);
        TreeNode root_non_symmetric = new TreeNode(0, node_non_symmetric_2_1, node_non_symmetric_2_2);

        TreeNode node_4_2 = new TreeNode(4);
        TreeNode node_4_1 = new TreeNode(4);
        TreeNode node_3_2 = new TreeNode(3);
        TreeNode node_3_1 = new TreeNode(3);
        TreeNode node_2_2 = new TreeNode(2, node_4_2, node_3_2);
        TreeNode node_2_1 = new TreeNode(2, node_3_1, node_4_1);
        TreeNode root = new TreeNode(0, node_2_1, node_2_2);

        TreeNode singleRoot = new TreeNode(0);

        return Stream.of(
                Arguments.of(root, true),
                Arguments.of(singleRoot, true),
                Arguments.of(null, true),
                Arguments.of(root_non_symmetric, false)
        );
    }

}