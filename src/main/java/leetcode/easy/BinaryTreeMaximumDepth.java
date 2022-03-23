package leetcode.easy;

import leetcode.common.TreeNode;

/**
 * Difficulty: Easy
 *
 * @see <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">LeetCode: Binary Tree Maximum Depth</a>
 */
public class BinaryTreeMaximumDepth {

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
