package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClimbingStairsTest {

    @Test
    void example1() {
        assertThat(ClimbingStairs.climbStairs(2)).isEqualTo(2);
        assertThat(ClimbingStairs.climbStairs_easyToUnderstand(2)).isEqualTo(2);
    }

    @Test
    void example2() {
        assertThat(ClimbingStairs.climbStairs(3)).isEqualTo(3);
        assertThat(ClimbingStairs.climbStairs_easyToUnderstand(3)).isEqualTo(3);
    }
}