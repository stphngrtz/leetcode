package leetcode.easy;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Difficulty: Easy
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/">LeetCode: Binary Tree Inorder Traversal</a>
 */
public class BinaryTreeInorderTraversal {

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return Collections.emptyList();

        List<Integer> result = new ArrayList<>();
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }
}
