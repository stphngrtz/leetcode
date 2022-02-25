package leetcode.easy;

import java.util.HashMap;

/**
 * Difficulty: Easy
 *
 * @see <a href="https://leetcode.com/problems/two-sum/">LeetCode: Two Sum</a>
 */
public class TwoSum {

    /**
     * Time Complexity is O(n^2), Space Complexity is O(1)
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        throw new IllegalArgumentException();
    }

    /**
     * Time Complexity is O(n), Space Complexity is O(n)
     *
     * @see <a href="https://www.code-recipe.com/post/two-sum">Code Recipe Solution</a>
     */
    public static int[] twoSumWithHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer requiredNum = target - nums[i];
            if (indexMap.containsKey(requiredNum)) {
                return new int[]{indexMap.get(requiredNum), i};
            }
            indexMap.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }
}
