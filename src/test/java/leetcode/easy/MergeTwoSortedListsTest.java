package leetcode.easy;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MergeTwoSortedListsTest {

    @Test
    void example1() {
        assertTrue(ListNode.isSameList(
                MergeTwoSortedLists.mergeTwoLists(
                        new ListNode(1, new ListNode(2, new ListNode(4))),
                        new ListNode(1, new ListNode(3, new ListNode(4)))
                ),
                new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))))
        ));
    }

    @Test
    void example2() {
        assertTrue(ListNode.isSameList(
                MergeTwoSortedLists.mergeTwoLists(
                        null,
                        null
                ),
                null
        ));
    }

    @Test
    void example3() {
        assertTrue(ListNode.isSameList(
                MergeTwoSortedLists.mergeTwoLists(
                        null,
                        new ListNode(0)
                ),
                new ListNode(0)
        ));
    }
}