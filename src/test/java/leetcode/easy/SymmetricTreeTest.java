package leetcode.easy;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SymmetricTreeTest {

    @Test
    void example1() {
        assertThat(SymmetricTree.isSymmetric(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3))))).isTrue();
    }

    @Test
    void example2() {
        assertThat(SymmetricTree.isSymmetric(new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3))))).isFalse();
    }
}