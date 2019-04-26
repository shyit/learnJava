package net.htwater.algorithm.sort;

import java.util.Arrays;

/**
 * Created by 96955 on 2019/4/26.
 */
public class RadixSort {
    public static void main(String[] args) {

        int[] nums = new int[]{111, 31, 29, 37, 422, 125, 328, 16, 84, 235, 65, 98, 456, 1, 6, 7, 55};

        System.out.println(Arrays.toString(nums));

        radix(nums);

        System.out.println(Arrays.toString(nums));
    }

    /*
    * 基数排序
    * 1.将所有待比较数值（正整数）统一为同样的数字长度，数字较短的数前面补零
    * 2.然后，从最低位开始，一次进行一次排序。
    * 3.这样最低位排序一直到最高位排序完成以后，数列就变成一个有序序列
    * */
    private static void radix(int[] nums) {
        int sortTimes = getSortTimes(nums);

        int[][] temp = new int[10][nums.length];

        for (int i = 0, n = 1; i < sortTimes; i++, n = n * 10) {
            int[] index = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int j = 0; j < nums.length; j++) {
                int ys = nums[j] / n % 10;
                temp[ys][index[ys]] = nums[j];
                index[ys]++;
            }

            for (int m = 0, k = 0; m < 10; m++) {
                for (int p = 0; p < index[m]; p++) {
                    nums[k] = temp[m][p];
                    k++;
                }
            }

        }
    }

    private static int getSortTimes(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        int sortTimes = (max + "").length();

        return sortTimes;
    }
}
