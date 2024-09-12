package net.htwater.leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * 类  名: LeetcodeNo739
 * 描  述: LeetcodeNo739. 每日温度
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-09-12 11:15
 */
public class LeetcodeNo739 {

    public static void main(String[] args) {
        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};

        int[] answer = dailyTemperatures2(temperatures);

        System.out.println(Arrays.toString(answer));
    }

    // 从前往后
    public static int[] dailyTemperatures2(int[] temperatures) {
        int[] answer = new int[temperatures.length];

        // 单调栈
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int temperature = temperatures[i];
            // 当前单调栈不为空 并且 当前温度大于栈顶温度 栈顶元素出栈 设置栈顶元素对应的结果值
            while (!stack.isEmpty() && temperature > temperatures[stack.peek()]) {
                int indexPre = stack.pop();
                answer[indexPre] = i - indexPre;
            }

            stack.push(i);
        }

        return answer;
    }

    // 从后往前
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];

        // 单调栈
        Stack<Integer> stack = new Stack<>();

        for (int i = temperatures.length - 1; i >= 0; i--) {
            int temperature = temperatures[i];
            // 当前单调栈不为空 并且 当前温度大于栈顶温度 栈顶元素出栈
            while (!stack.isEmpty() && temperature >= temperatures[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                answer[i] = 0;
            } else {
                answer[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        return answer;
    }
}
