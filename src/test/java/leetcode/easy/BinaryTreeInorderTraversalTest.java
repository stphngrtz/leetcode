package leetcode.easy;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeInorderTraversalTest {

    @Test
    void example1() {
        assertThat(BinaryTreeInorderTraversal.inorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)))).containsExactly(1, 3, 2);
    }

    @Test
    void example2() {
        assertThat(BinaryTreeInorderTraversal.inorderTraversal(null)).isEmpty();
    }

    @Test
    void example3() {
        assertThat(BinaryTreeInorderTraversal.inorderTraversal(new TreeNode(1))).containsExactly(1);
    }
}