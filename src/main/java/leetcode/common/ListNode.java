package leetcode.common;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * @see <a href="https://github.com/interviewcoder/leetcode/blob/master/src/com/leetcode/ListNode.java">LeetCode ListNode</a>
     */
    public static boolean isSameList(ListNode head1, ListNode head2) {
        if (head1 == null && head2 == null) {
            return true;
        }
        if (head1 == null) {
            return false;
        }
        if (head2 == null) {
            return false;
        }
        return (head1.val == head2.val) && isSameList(head1.next, head2.next);
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
