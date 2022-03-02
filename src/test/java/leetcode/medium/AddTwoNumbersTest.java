package leetcode.medium;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AddTwoNumbersTest {

    @Test
    void example1() {
        assertTrue(ListNode.isSameList(
                AddTwoNumbers.addTwoNumbers(
                        new ListNode(2, new ListNode(4, new ListNode(3))),
                        new ListNode(5, new ListNode(6, new ListNode(4)))
                ),
                new ListNode(7, new ListNode(0, new ListNode(8)))
        ));
    }

    @Test
    void example2() {
        assertTrue(ListNode.isSameList(
                AddTwoNumbers.addTwoNumbers(
                        new ListNode(0),
                        new ListNode(0)
                ),
                new ListNode(0)
        ));
    }

    @Test
    void example3() {
        assertTrue(ListNode.isSameList(
                AddTwoNumbers.addTwoNumbers(
                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))),
                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))
                ),
                new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))))
        ));
    }

    @Test
    void example4() {
        assertTrue(ListNode.isSameList(
                AddTwoNumbers.addTwoNumbers(
                        new ListNode(1, new ListNode(8)),
                        new ListNode(0)
                ),
                new ListNode(1, new ListNode(8))
        ));
    }
}