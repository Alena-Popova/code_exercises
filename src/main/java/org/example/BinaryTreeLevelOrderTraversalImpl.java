package org.example;

import java.util.ArrayList;
import java.util.List;

import org.example.utils.TreeNode;

public class BinaryTreeLevelOrderTraversalImpl
{
    public static List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> result = new ArrayList<>();
        if (root != null)
        {
            List<Integer> newOne = new ArrayList<>();
            newOne.add(root.val);
            result.add(newOne);
            getLevel(new ArrayList<>(List.of(root)), new ArrayList<>(), result);
        }
        return result;
    }

    private static void getLevel(List<TreeNode> iterator, List<TreeNode> bank, List<List<Integer>> result)
    {
        List<Integer> newOne = new ArrayList<>();
        if (iterator.isEmpty())
        {
            return;
        }
        for (TreeNode node : iterator)
        {
            if (node != null)
            {
                if (node.left != null)
                {
                    newOne.add(node.left.val);
                    bank.add(node.left);
                }
                if (node.right != null)
                {
                    newOne.add(node.right.val);
                    bank.add(node.right);
                }
            }
        }
        if (newOne.isEmpty())
        {
            return;
        }
        result.add(newOne);
        getLevel(bank, new ArrayList<>(), result);
    }

}
