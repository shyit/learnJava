package net.htwater.algorithm.sort;

import java.util.Arrays;

/**
 * Created by 96955 on 2019/4/25.
 */
public class SelectSort {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 9, 7, 2, 5, 8, 6, 4};

        System.out.println(Arrays.toString(nums));

        select(nums);

        System.out.println(Arrays.toString(nums));
    }

    /*
    * 选择算法
    * 1.首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
    * 2.然后，再从剩余未排序元素中继续寻找最小（大）元素
    * 3.以此类推，直到所有元素均排序完毕
    * */
    public static void select(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] < nums[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
    }
}
