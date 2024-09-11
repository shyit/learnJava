package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo485
 * 描  述: LeetcodeNo485. 最大连续 1 的个数
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-09-11 15:50
 */
public class LeetcodeNo485 {

    // 给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。
    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, 1, 1, 0, 1};

        int count = findMaxConsecutiveOnes(nums);

        System.out.println("count = " + count);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;

        int countTemp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                countTemp++;
            }else {
                if (count < countTemp) {
                    count = countTemp;
                }
                countTemp = 0;
            }
        }

        // 数组最后如果是1 需要另外判断
        if (count < countTemp) {
            count = countTemp;
        }

        return count;
    }
}
