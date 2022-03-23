package leetcode.easy;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeMaximumDepthTest {

    @Test
    void example1() {
        assertThat(BinaryTreeMaximumDepth.maxDepth(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))))).isEqualTo(3);
    }

    @Test
    void example2() {
        assertThat(BinaryTreeMaximumDepth.maxDepth(new TreeNode(1, null, new TreeNode(2)))).isEqualTo(2);
    }
}