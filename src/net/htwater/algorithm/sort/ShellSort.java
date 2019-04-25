package net.htwater.algorithm.sort;

import java.util.Arrays;

/**
 * Created by 96955 on 2019/4/24.
 */
public class ShellSort {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 9, 7, 2, 5, 8, 6, 4};

        System.out.println(Arrays.toString(nums));

        hellSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    /*
    * 希尔排序
    * 1.先取一个小于n的整数d1作为第一个增量，把文件的全部记录分组，所有距离为d1的倍数的记录放在同一组中
    * 2.先在各组内进行直接插入排序，
    * 3.然后，取第二个增量d2<d1重复上述分组和排序
    * 4.当增量dn=1,即所有记录放在同一组中进行直接插入排序为止
    * */
    private static void hellSort(int[] nums) {
        for (int step = nums.length / 2; step > 0; step = step / 2) {
            for (int i = 0; i < step; i++) {
                for (int j = i + step; j < nums.length; j = j + step) {
                    int temp = nums[j];

                    int k = j;
                    while ((k > i) && (nums[k - step] > temp)) {
                        nums[k] = nums[k - step];
                        k = k - step;
                    }
                    nums[k] = temp;
                }

                System.out.println("第"+i+"次排序结果"+Arrays.toString(nums));
            }
        }
    }
}
