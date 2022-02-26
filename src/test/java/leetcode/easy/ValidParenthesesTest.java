package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesesTest {

    @Test
    void example1() {
        assertThat(ValidParentheses.isValid("()")).isTrue();
    }

    @Test
    void example2() {
        assertThat(ValidParentheses.isValid("()[]{}")).isTrue();
    }

    @Test
    void example3() {
        assertThat(ValidParentheses.isValid("(]")).isFalse();
    }

    @Test
    void example4() {
        assertThat(ValidParentheses.isValid("{[]}")).isTrue();
    }

    @Test
    void example5() {
        assertThat(ValidParentheses.isValid("[")).isFalse();
    }

    @Test
    void example6() {
        assertThat(ValidParentheses.isValid("((")).isFalse();
    }

    @Test
    void example7() {
        assertThat(ValidParentheses.isValid("){")).isFalse();
    }
}