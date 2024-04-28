package net.htwater.leetcode;

import java.util.Arrays;

/**
 * 类  名: LeetcodeNo912
 * 描  述: LeetcodeNo912. 排序数组
 * 
 * 功  能: 
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-27 23:17
 */
public class LeetcodeNo912 {
    // 给你一个整数数组 nums，请你将该数组升序排列。
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 9, 7, 2, 5, 8, 6, 4};

        System.out.println(Arrays.toString(nums));

        quick(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }


    /*
     * 快速排序
     * 1.挑选基准值：从数列中挑出一个元素，称为基准
     * 2.分割：重新排序数列，所有比基准小的元素放在基准前面，所有比基准大的元素摆在基准后面（与基准相等的数可以到任何一边）。
     *         在这个分割结束之后，对基准值的排序就已经完成。
     * 3.递归排序子序列：递归地将小于基准值元素的子序列和大于基准值元素的子序列排序
     * */
    private static void quick(int[] nums, int start, int end) {
        if (start == end) {
            return;
        }

        int left = start;
        int right = end;

        // 随机选择一个基准
        int indexTemp = (int) (start + Math.random() * (end - start));
        int temp = nums[start];
        nums[start] = nums[indexTemp];
        nums[indexTemp] = temp;


        // 基准值
        temp = nums[start];

        while (left < right) {
            while (nums[right] >= temp) {
                if (left == right) {
                    break;
                }
                right--;
            }

            nums[left] = nums[right];

            while (nums[left] < temp) {
                if (left == right) {
                    break;
                }
                left++;
            }

            nums[right] = nums[left];
        }

        nums[left] = temp;

        // 递归处理基准左边的数据
        if (start < left) {
            quick(nums, start, left - 1);
        }

        // 递归处理基准右边的数据
        if (end > left) {
            quick(nums, left + 1, end);
        }
    }
}
