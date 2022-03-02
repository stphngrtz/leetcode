package leetcode.easy;

/**
 * Difficulty: Easy
 *
 * @see <a href="https://leetcode.com/problems/search-insert-position/">LeetCode: Search Insert Position</a>
 */
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target)
                return i;
        }
        return nums.length;
    }

    public static int binarySearchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] == target)
                return m;
            else if (nums[m] > target)
                r = m-1;
            else
                l = m+1;
        }
        return l;
    }
}
