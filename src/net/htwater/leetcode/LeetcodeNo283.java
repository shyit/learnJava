package net.htwater.leetcode;

import java.util.Arrays;

/**
 * 类  名: LeetcodeNo283
 * 描  述: LeetcodeNo283. 移动零  简单
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-03-27 19:12
 */
public class LeetcodeNo283 {
    //    给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    //    请注意 ，必须在不复制数组的情况下原地对数组进行操作。
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};

        moveZeroes2(nums);

        // 1 3 12 0 0
        Arrays.stream(nums).forEach(item -> System.out.println(item));
    }

    public static void moveZeroes(int[] nums) {
        // 0的个数
        int zeroCount = 0;
        for (int i = 0; i < nums.length - zeroCount; i++) {
            // 出现0 遍历后面的数组
            if (nums[i] == 0) {
                for (int j = i; j < (nums.length - zeroCount - 1); j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - zeroCount - 1] = 0;
                i--;
                zeroCount++;
            }
        }
    }

    public static void moveZeroes2(int[] nums) {
        // 0的个数
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                // 当前位置为0时 计数器加1
                zeroCount++;
            } else {
                // 当前位置不为0时 向前复制
                nums[i - zeroCount] = nums[i];
            }
        }

        // 末尾设置为 0
        for (int i = 0; i < zeroCount; i++) {
            nums[nums.length - 1 - i] = 0;
        }
    }

    public static void moveZeroes3(int[] nums) {
        // 不为0的个数
        int notZeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // 当前位置不为0时 向前复制
                nums[notZeroCount] = nums[i];
                notZeroCount++;
            }
        }

        // 末尾设置为 0
        for (int i = notZeroCount; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
