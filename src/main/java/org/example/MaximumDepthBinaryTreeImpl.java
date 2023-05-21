package org.example;

import org.example.utils.TreeNode;

public class MaximumDepthBinaryTreeImpl
{

    /**
     * Given the root of a binary tree, return its maximum depth.
     * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     */
    public static int maxDepth(TreeNode root)
    {
        return depth(root, 0);
    }

    private static int depth(TreeNode root, int depth)
    {
        if (root == null)
        {
            return depth;
        }
        int newDepth = depth + 1;
        return Math.max(depth(root.left, newDepth), depth(root.right, newDepth));
    }
}
