package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo35
 * 描  述: LeetcodeNo35. 搜索插入位置
 * 
 * 功  能: 
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-06-27 20:36
 */
public class LeetcodeNo35 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};

        int indexTarget = searchInsert(nums,7);

        System.out.println("indexTarget = " + indexTarget);
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }

        return nums.length;
    }
}
