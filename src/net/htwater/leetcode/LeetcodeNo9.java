package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo9
 * 描  述: LeetcodeNo9. 回文数
 *
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-23 15:19
 */
public class LeetcodeNo9 {

//    给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
//    回文数 是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    public static void main(String[] args) {
        int num = 121;

        boolean flag = isPalindrome2(num);

        // true
        System.out.println(flag);
    }

    // 转换String
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String numStr = x + "";
        int numLength = numStr.length();

        // 循环对比是否相等
        for (int i = 0; i < numLength / 2; i++) {
            if (!Character.toString(numStr.charAt(i)).equals(Character.toString(numStr.charAt(numLength - 1 - i)))) {
                return false;
            }
        }

        return true;
    }

    // 连续取余数 生产逆序的数字 然后对比是否相等
    public static boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }

        int temp = x;
        int xReverse = 0;
        while (temp > 0) {
            xReverse = xReverse * 10 + temp % 10;
            temp = temp / 10;
        }

        return xReverse == x;
    }
}
