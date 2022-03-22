package leetcode.easy;

/**
 * Difficulty: Easy
 *
 * @see <a href="https://leetcode.com/problems/climbing-stairs/">LeetCode: Climbing Stairs</a>
 */
public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int n1 = 2; // which is n-1
        int n2 = 1; // which is n-2
        int result = 0;

        for (int i = 2; i < n; i++) {
            result = n1 + n2;
            n2 = n1;
            n1 = result;
        }
        return result;
    }

    public static int climbStairs_easyToUnderstand(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int[] x = new int[n+1];
        x[0] = 0;
        x[1] = 1;
        x[2] = 2;

        for (int i = 3; i <= n; i++) {
            x[i] = x[i-1] + x[i-2];
        }
        return x[n];
    }
}
