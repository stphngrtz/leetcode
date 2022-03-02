package leetcode.easy;

/**
 * Difficulty: Easy
 *
 * @see <a href="https://leetcode.com/problems/maximum-subarray/">LeetCode: Maximum Subarray</a>
 */
public class MaximumSubarray {

    /**
     * @see <a href="https://leetcode.com/problems/maximum-subarray/discuss/1595097/JAVA-or-Kadane's-Algorithm-or-Explanation-Using-Image">Kadane's Algorithm with Explanation</a>
     */
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int num : nums) {
            sum += num;
            max = Math.max(sum, max);

            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}
