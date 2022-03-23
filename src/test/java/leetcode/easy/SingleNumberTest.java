package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingleNumberTest {

    @Test
    void example1() {
        assertThat(SingleNumber.singleNumber(new int[]{2, 2, 1})).isEqualTo(1);
    }

    @Test
    void example2() {
        assertThat(SingleNumber.singleNumber(new int[]{4, 1, 2, 1, 2})).isEqualTo(4);
    }

    @Test
    void example3() {
        assertThat(SingleNumber.singleNumber(new int[]{1})).isEqualTo(1);
    }
}