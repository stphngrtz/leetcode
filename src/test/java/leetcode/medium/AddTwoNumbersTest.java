package leetcode.medium;

import leetcode.medium.AddTwoNumbers.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddTwoNumbersTest {

    @Test
    void example1() {
        assertThat(AddTwoNumbers.addTwoNumbers(
                new ListNode(2, new ListNode(4, new ListNode(3))),
                new ListNode(5, new ListNode(6, new ListNode(4)))
        )).isEqualTo(
                new ListNode(7, new ListNode(0, new ListNode(8)))
        );
    }

    @Test
    void example2() {
        assertThat(AddTwoNumbers.addTwoNumbers(
                new ListNode(0),
                new ListNode(0)
        )).isEqualTo(
                new ListNode(0)
        );
    }

    @Test
    void example3() {
        assertThat(AddTwoNumbers.addTwoNumbers(
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))),
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))
        )).isEqualTo(
                new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))))
        );
    }

    @Test
    void example4() {
        assertThat(AddTwoNumbers.addTwoNumbers(
                new ListNode(1, new ListNode(8)),
                new ListNode(0)
        )).isEqualTo(
                new ListNode(1, new ListNode(8))
        );
    }
}