package leetcode.easy;

/**
 * Difficulty: Easy
 *
 * @see <a href="https://leetcode.com/problems/single-number/">LeetCode: Single Number</a>
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            // System.out.println(result + " ^= " + num + " = " + (result ^ num));
            result ^= num;
        }
        return result;
    }
}
