package org.example.amazon;

import java.util.Map;

import org.example.utils.TreeNode;

/**
 * https://leetcode.com/problems/cousins-in-binary-tree/
 * Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y, return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.
 * Two nodes of a binary tree are cousins if they have the same depth with different parents.
 * Note that in a binary tree, the root node is at the depth 0, and children of each depth k node are at the depth k + 1.
 */
public class CousinsInBinaryTreeImpl
{
    /**
     * Constraints:
     * <p>
     * The number of nodes in the tree is in the range [2, 100].
     * 1 <= Node.val <= 100
     * Each node has a unique value.
     * x != y
     * x and y are exist in the tree.
     */
    public static boolean isCousins(TreeNode root, int x, int y)
    {
        if (root == null)
        {
            return false;
        }
        Map.Entry<TreeNode, Integer> parentX = getParentAndDepth(null, root, x, 0);

        Map.Entry<TreeNode, Integer> parentY = getParentAndDepth(null, root, y, 0);

        return parentX.getValue().compareTo(parentY.getValue()) == 0
                && parentX.getKey() != null
                && parentY.getKey() != null
                && parentX.getKey().val != parentY.getKey().val;
    }

    private static Map.Entry<TreeNode, Integer> getParentAndDepth(TreeNode parent, TreeNode node, int x, int depth)
    {
        if (node.val == x)
        {
            return Map.entry(parent, depth);
        }

        Map.Entry<TreeNode, Integer> left = node.left != null
                ? getParentAndDepth(node, node.left, x, depth + 1)
                : null;

        Map.Entry<TreeNode, Integer> right = node.right != null
                ? getParentAndDepth(node, node.right, x, depth + 1)
                : null;
        if (left != null)
        {
            return left;
        }
        else
        {
            return right;
        }
    }
}
