package net.htwater.leetcode;


/**
 * 类  名: LeetcodeNo414
 * 描  述: LeetcodeNo414. 第三大的数
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-09-11 09:55
 */
public class LeetcodeNo414 {

    // 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 3, 1};

        int resultNum = thirdMax(nums);

        System.out.println("resultNum = " + resultNum);

    }

    public static int thirdMax(int[] nums) {
        // 数据中 最小值为 Integer.MIN_VALUE 所以使用Long.MIN_VALUE
        long bigOne = Long.MIN_VALUE;
        long bigTwo = bigOne;
        long bigThree = bigTwo;

        for (int i = 0; i < nums.length; i++) {
            int numTemp = nums[i];

            if (numTemp == bigOne || numTemp == bigTwo || numTemp == bigThree) {
                continue;
            }

            if (numTemp > bigOne) {
                bigThree = bigTwo;
                bigTwo = bigOne;
                bigOne = numTemp;
            } else if (numTemp > bigTwo) {
                bigThree = bigTwo;
                bigTwo = numTemp;
            } else if (numTemp > bigThree) {
                bigThree = numTemp;
            }
        }

        if (bigThree == Long.MIN_VALUE) {
            return (int) bigOne;
        }

        return (int) bigThree;
    }
}
