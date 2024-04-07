package net.htwater.leetcode;


import java.util.Stack;

/**
 * 类  名: LeetcodeNo394
 * 描  述: LeetcodeNo394. 字符串解码
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-03 14:22
 */
public class LeetcodeNo394 {

    // 给定一个经过编码的字符串，返回它解码后的字符串。
    // 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
    // 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
    // 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
    public static void main(String[] args) {
        String str = "3[a]2[bc]";
        String result = decodeString(str);

        // aaabcbc
        System.out.println(result);
    }

    public static String decodeString(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            // 当前字符
            Character c = s.charAt(i);
            if (c.compareTo(']') == 0) {
                // 如果当前是 ] 就处理当前子串

                // 当前子串 字符
                String cc = stack.pop();

                // 组合 文字
                String tempStr = "";
                String tempResult = "";
                while (!cc.equals("[")) {
                    tempStr = cc + tempStr;
                    cc = stack.pop();
                }

                // 计算 重复次数
                int count = 0;
                String countStr = "";
                while (!stack.empty()) {
                    cc = stack.pop();
                    if (cc.length() == 1 && Character.isDigit(cc.charAt(0))) {
                        countStr = cc + countStr;
                    } else {
                        stack.push(cc);
                        break;
                    }

                }
                count = Integer.parseInt(countStr);

                // 生成重复的文字
                for (int j = 0; j < count; j++) {
                    tempResult += tempStr;
                }

                // 把结果 压回栈中
                stack.push(tempResult);
            } else {
                // 不是 ] 就压入栈中
                stack.push(c.toString());
            }
        }

        String result = "";
        while (!stack.empty()) {
            result = stack.pop() + result;
        }

        return result;
    }
}
