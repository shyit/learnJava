package net.htwater.algorithmmuke.stack;

public class Solution {

    public static boolean isValid(String s) {
        ArrayStack<Character> stack = new ArrayStack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (c == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (c == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (c == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("[]("));
    }
}
