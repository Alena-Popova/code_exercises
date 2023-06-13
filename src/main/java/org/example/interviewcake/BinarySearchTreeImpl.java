package org.example.interviewcake;

import org.example.utils.TreeNode;

public class BinarySearchTreeImpl
{


    public static boolean isBinaryTree(TreeNode node)
    {
        if (node == null)
        {
            return true;
        }
        return isLeftChild(node, node.left)
                && isRightChild(node, node.right)
                && isBinaryTree(node.left)
                && isBinaryTree(node.right);
    }

    private static boolean isLeftChild(TreeNode root, TreeNode left)
    {
        if (left == null)
        {
            return true;
        }
        return left.val < root.val && isLeftChild(root, left.left) && isLeftChild(root, left.right);
    }

    private static boolean isRightChild(TreeNode root, TreeNode right)
    {
        if (right == null)
        {
            return true;
        }
        return right.val > root.val && isRightChild(root, right.left) && isRightChild(root, right.right);
    }
}
