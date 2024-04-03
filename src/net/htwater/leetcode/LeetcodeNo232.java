package net.htwater.leetcode;


import java.util.Stack;

/**
 * 类  名: LeetcodeNo232
 * 描  述: LeetcodeNo232. 用栈实现队列 简单
 * 
 * 功  能: 
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-03 13:56
 */
public class LeetcodeNo232 {

    // 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
    // 实现 MyQueue 类：
    // void push(int x) 将元素 x 推到队列的末尾
    // int pop() 从队列的开头移除并返回元素
    // int peek() 返回队列开头的元素
    // boolean empty() 如果队列为空，返回 true ；否则，返回 false
    //
    // 说明：
    // 你 只能 使用标准的栈操作 —— 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
    // 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
    public static void main(String[] args) {
        
    }

    class MyQueue {
        // 输入栈
        private Stack stackIn=new Stack();
        // 输出栈
        private Stack stackOut = new Stack();

        public MyQueue() {

        }

        // 压入数据到 输入栈
        public void push(int x) {
            stackIn.push(x);
        }

        // 判断输出栈 是否有数据。有则输出。无则把输入栈转移到输出栈，然后输出
        public int pop() {
            if (!stackOut.empty()) {
                return (int) stackOut.pop();
            } else {
                while (!stackIn.empty()) {
                    stackOut.push(stackIn.pop());
                }
            }
            return (int) stackOut.pop();
        }

        // 判断输出栈 是否有数据。有则输出。无则把输入栈转移到输出栈，然后输出
        public int peek() {
            if (!stackOut.empty()) {
                return (int) stackOut.peek();
            } else {
                while (!stackIn.empty()) {
                    stackOut.push(stackIn.pop());
                }
            }
            return (int) stackOut.peek();
        }

        // 输入栈 输出栈 都为空，才是空
        public boolean empty() {
            return stackIn.empty() && stackOut.empty();
        }
    }
}
