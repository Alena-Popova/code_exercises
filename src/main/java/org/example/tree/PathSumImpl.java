package org.example.tree;

import org.example.utils.TreeNode;

/**
 * https://leetcode.com/problems/path-sum/
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 * A leaf is a node with no children.
 */
public class PathSumImpl
{
    /**
     * The number of nodes in the tree is in the range [0, 5000].
     * -1000 <= Node.val <= 1000
     * -1000 <= targetSum <= 1000
     */
    public static boolean hasPathSum(TreeNode root, int targetSum)
    {
        if (root == null)
        {
            return false;
        }
        targetSum -= root.val;

        if (root.left == null && root.right == null)
        {
            return targetSum == 0;
        }
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
