package net.htwater.algorithm.sort;

import java.util.Arrays;

/**
 * Created by 96955 on 2019/4/24.
 */
public class QuickSort {
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

        int left = start;
        int right = end;
        int temp = nums[left];

        while (left < right) {

            while ((left < right) && (nums[right] >= temp)) {
                right--;
            }

            if (left < right) {
                nums[left] = nums[right];
                left++;
            }

            while ((left < right) && (nums[left] <= temp)) {
                left++;
            }

            if (left < right) {
                nums[right] = nums[left];
                right--;
            }

        }

        nums[left] = temp;

        if (start < left - 1) {
            quick(nums, start, left - 1);
        }

        if (right + 1 < end) {
            quick(nums, right + 1, end);
        }

    }
}
