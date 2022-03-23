package leetcode.easy;

import leetcode.common.TreeNode;

/**
 * Difficulty: Easy
 *
 * @see <a href="https://leetcode.com/problems/symmetric-tree/">LeetCode: Symmetric Tree</a>
 */
public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetric(root.left, root.right);
    }

    private static boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;
        if (left.val != right.val)
            return false;
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
