package io.github.bfeng.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by bfeng on 1/22/16.
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (Character c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (pair(stack.peek(), c)) {
                    stack.poll();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean pair(char a, char b) {
        return ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'));
    }
}
