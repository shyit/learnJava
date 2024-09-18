package net.htwater.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 类  名: LeetcodeNo575
 * 描  述: LeetcodeNo575. 分糖果
 *
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-09-18 10:08
 */
public class LeetcodeNo575 {

    // Alice 有 n 枚糖，其中第 i 枚糖的类型为 candyType[i] 。Alice 注意到她的体重正在增长，所以前去拜访了一位医生。
    //医生建议 Alice 要少摄入糖分，只吃掉她所有糖的 n / 2 即可（n 是一个偶数）。Alice 非常喜欢这些糖，她想要在遵循医生建议的情况下，尽可能吃到最多不同种类的糖。
    //给你一个长度为 n 的整数数组 candyType ，返回： Alice 在仅吃掉 n / 2 枚糖的情况下，可以吃到糖的 最多 种类数。
    public static void main(String[] args) {
        int[] candyType = new int[]{1, 1, 2, 2, 3, 3};

        int count = distributeCandies(candyType);

        System.out.println("count = " + count);
    }

    public static int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            set.add(candyType[i]);
        }

        // 糖果种类
        int kind = set.size();

        // 糖果种类 和 一半的糖果 比较哪个小
        int maxCount = Math.min(kind, candyType.length / 2);

        return maxCount;
    }
}
