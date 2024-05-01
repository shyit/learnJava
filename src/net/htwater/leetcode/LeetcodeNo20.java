package net.htwater.leetcode;

import net.htwater.think.D11.D11_05.Stack;

/**
 * 类  名: LeetcodeNo20
 * 描  述: LeetcodeNo20.有效的括号
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-05-02 03:54
 */
public class LeetcodeNo20 {

    //    给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
    //    有效字符串需满足：
    //    左括号必须用相同类型的右括号闭合。
    //    左括号必须以正确的顺序闭合。
    //    每个右括号都有一个对应的相同类型的左括号。
    public static void main(String[] args) {
        String s = "()[][}";

        boolean resultBoolean = isValid(s);

        // true
        System.out.println(resultBoolean);
    }

    public static boolean isValid(String s) {
        Stack<String> stack = new Stack<>();

        int length = s.length();
        for (int i = 0; i < length; i++) {
            String tempStr = s.charAt(i) + "";
            if (!stack.empty()) {
                String oldStr = stack.peek();
                // 如果成对出栈 否则入栈
                if (("(".equals(oldStr) && ")".equals(tempStr))
                        || ("[".equals(oldStr) && "]".equals(tempStr))
                        || ("{".equals(oldStr) && "}".equals(tempStr))
                ) {
                    stack.pop();
                } else {
                    stack.push(tempStr);
                }
            } else {
                stack.push(tempStr);
            }
        }

        return stack.empty();
    }
}
