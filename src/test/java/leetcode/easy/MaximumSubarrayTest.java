package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumSubarrayTest {

    @Test
    void example1() {
        assertThat(MaximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})).isEqualTo(6);
    }

    @Test
    void example2() {
        assertThat(MaximumSubarray.maxSubArray(new int[]{1})).isEqualTo(1);
    }

    @Test
    void example3() {
        assertThat(MaximumSubarray.maxSubArray(new int[]{5, 4, -1, 7, 8})).isEqualTo(23);
    }
}