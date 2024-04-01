package net.htwater.leetcode;

import java.util.Arrays;

/**
 * 类  名: LeetcodeNo88
 * 描  述: LeetcodeNo88. 合并两个有序数组 简单
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-03-26 12:10
 */
public class LeetcodeNo88 {
    //    给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
    //    请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
    //    注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;

        merge2(nums1, m, nums2, n);

        // 1 2 2 3 5 6
        Arrays.stream(nums1).forEach(item -> System.out.println(item));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;

        int[] result = new int[m + n];

        while (i < m || j < n) {
            if (i == m) {
                result[i + j] = nums2[j];
                j++;
                continue;
            }

            if (j == n) {
                result[i + j] = nums1[i];
                i++;
                continue;
            }

            if (nums1[i] <= nums2[j]) {
                result[i + j] = nums1[i];
                i++;
            } else {
                result[i + j] = nums2[j];
                j++;
            }

        }

        // 题目要求存储在数组 nums1。应该是 nums1 的原始地址。不能通过=赋值。应该循环赋值
        // nums1 = resutl;

        for (int k = 0; k < result.length; k++) {
            nums1[k] = result[k];
        }
    }

    // 从最大的 开始 可以省略 辅助数组
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 || j >= 0) {
            if (i < 0) {
                nums1[i + j + 1] = nums2[j];
                j--;
                continue;
            }

            if (j < 0) {
                nums1[i + j + 1] = nums1[i];
                i--;
                continue;
            }

            if (nums1[i] <= nums2[j]) {
                nums1[i + j + 1] = nums2[j];
                j--;

            } else {
                nums1[i + j + 1] = nums1[i];
                i--;
            }

        }
    }
}
