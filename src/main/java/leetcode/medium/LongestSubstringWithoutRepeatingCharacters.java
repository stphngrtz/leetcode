package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Difficulty: Medium
 *
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">LeetCode: Longest Substring Without Repeating Characters</a>
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while (i < s.length()) {
            if (set.add(s.charAt(i))) {
                i++;
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(j));
                j++;
            }
        }
        return max;
    }
}
