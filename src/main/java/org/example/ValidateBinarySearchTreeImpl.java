package org.example;

import org.example.utils.TreeNode;

public class ValidateBinarySearchTreeImpl
{

    /**
     * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
     */
    public static boolean isValidBST(TreeNode root)
    {
        if (root == null)
        {
            return true;
        }
        boolean isLeftValid = root.left == null || (root.left != null && root.left.val < root.val);
        boolean isRightValid = root.right == null || (root.right != null && root.right.val > root.val);
        return isLeftValid && isValidLeft(root.val, root.left)
                && isRightValid && isValidRight(root.val, root.right)
                && isValidBST(root.left)
                && isValidBST(root.right);
    }

    public static boolean isValidLeft(int value, TreeNode root)
    {
        if (root == null)
        {
            return true;
        }
        return root.val < value && isValidLeft(value, root.left) && isValidLeft(value, root.right);
    }

    public static boolean isValidRight(int value, TreeNode root)
    {
        if (root == null)
        {
            return true;
        }
        return root.val > value && isValidRight(value, root.left) && isValidRight(value, root.right);
    }


}
