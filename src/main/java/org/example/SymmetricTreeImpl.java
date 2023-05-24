package org.example;

import org.example.utils.TreeNode;

public class SymmetricTreeImpl
{
    public static boolean isSymmetric(TreeNode root)
    {
        if (root == null)
        {
            return true;
        }
        return compareTreeImMirror(root.left, root.right);
    }

    private static boolean compareTreeImMirror(TreeNode tree_1, TreeNode tree_2)
    {
        if (tree_1 == null && tree_2 == null)
        {
            return true;
        }
        if ((tree_1 != null && tree_2 == null) || (tree_1 == null && tree_2 != null))
        {
            return false;
        }
        boolean isValid = tree_1.val == tree_2.val;
        return isValid && compareTreeImMirror(tree_1.left, tree_2.right) && compareTreeImMirror(tree_1.right, tree_2.left);
    }


}
