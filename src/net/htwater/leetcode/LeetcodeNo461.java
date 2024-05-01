package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo461
 * 描  述: LeetcodeNo461. 汉明距离
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-29 16:19
 */
public class LeetcodeNo461 {
    //    两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
    //    给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
    public static void main(String[] args) {
        int x = 1;
        int y = 4;

        int count = hammingDistance(x, y);

        System.out.println(count);
    }

    public static int hammingDistance(int x, int y) {
        // 异或运算
        int z = x ^ y;
        String zzStr = Integer.toBinaryString(z);

        int length = zzStr.length();

        // 计算以后运算结果的1的个数
        int count = 0;
        for (int i = 0; i < length; i++) {
            if ("1".equals(zzStr.charAt(i) + "")) {
                count++;
            }
        }

        return count;
    }

    public static int hammingDistance2(int x, int y) {
        // 异或运算
        int z = x ^ y;

        // 计算以后运算结果的1的个数
        return Integer.bitCount(z);
    }
}
