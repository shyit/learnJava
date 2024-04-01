package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo70
 * 描  述: LeetcodeNo70. 爬楼梯 简单
 *
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-03-25 16:37
 */
public class LeetcodeNo70 {

    // 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
    // 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
    public static void main(String[] args) {
        // 5
        System.out.println(climbStairs(4));
    }

    static public int climbStairs(int n) {
        // 倒数第一阶台阶
        if (n == 1) {
            return 1;
        }

        // 倒数第二阶台阶
        if (n == 2) {
            return 2;
        }

        int x = 1;
        int y = 2;
        int temp = 0;

        // 倒数第三节台阶 以后
        for (int i = 3; i < n + 1; i++) {
            temp = y;
            y = y + x;
            x = temp;
        }


        return y;
    }
}
