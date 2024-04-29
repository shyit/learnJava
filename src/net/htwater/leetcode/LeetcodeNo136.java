package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo136
 * 描  述: LeetcodeNo136. 只出现一次的数字
 * 
 * 功  能: 
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-29 10:47
 */
public class LeetcodeNo136 {

    //    给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    //    你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};

        int singleNumber = singleNumber(nums);

        // 4
        System.out.println(singleNumber);

    }


    public static int singleNumber(int[] nums) {
        int num = 0;

        // 对所有数异或运行。相同的数值异或运算后归零。剩下的就是只出现一次的数字
        for (int i = 0; i < nums.length; i++) {
            num = num ^ nums[i];
        }

        return num;
    }
}
