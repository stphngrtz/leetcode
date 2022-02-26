package leetcode.medium;

import leetcode.common.ListNode;

/**
 * Difficulty: Medium
 *
 * @see <a href="https://leetcode.com/problems/add-two-numbers/">LeetCode: Add Two Numbers</a>
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0); // dummy val
        ListNode t1 = l1, t2 = l2, current = head;
        int carry = 0;
        while (t1 != null || t2 != null) {
            int v1 = t1 != null ? t1.val : 0;
            int v2 = t2 != null ? t2.val : 0;
            int sum = v1 + v2 + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (t1 != null)
                t1 = t1.next;
            if (t2 != null)
                t2 = t2.next;
        }
        if (carry > 0)
            current.next = new ListNode(carry);

        return head.next;
    }
}
