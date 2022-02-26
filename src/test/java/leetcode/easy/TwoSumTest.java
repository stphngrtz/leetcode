package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    @Test
    public void example1() {
        assertThat(TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9)).containsOnly(0, 1);
        assertThat(TwoSum.twoSumWithHashMap(new int[]{2, 7, 11, 15}, 9)).containsOnly(0, 1);
    }

    @Test
    public void example2() {
        assertThat(TwoSum.twoSum(new int[]{3, 2, 4}, 6)).containsOnly(1, 2);
        assertThat(TwoSum.twoSumWithHashMap(new int[]{3, 2, 4}, 6)).containsOnly(1, 2);
    }

    @Test
    public void example3() {
        assertThat(TwoSum.twoSum(new int[]{3, 3}, 6)).containsOnly(0, 1);
        assertThat(TwoSum.twoSumWithHashMap(new int[]{3, 3}, 6)).containsOnly(0, 1);
    }
}