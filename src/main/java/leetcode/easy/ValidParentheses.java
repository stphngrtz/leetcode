package leetcode.easy;

import java.util.List;
import java.util.Stack;

/**
 * Difficulty: Easy
 *
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">LeetCode: Valid Parentheses</a>
 */
public class ValidParentheses {

    private static final List<Character> OPEN = List.of('(', '{', '[');
    private static final List<Character> CLOSE = List.of(')', '}', ']');

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1)
            return false;

        char[] a = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (char parenthesis : a) {
            if (OPEN.contains(parenthesis))
                stack.push(parenthesis);
            else {
                int index = CLOSE.indexOf(parenthesis);
                if (stack.empty() || stack.pop() != OPEN.get(index))
                    return false;
            }
        }
        return stack.empty();
    }
}
