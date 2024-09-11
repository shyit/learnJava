package net.htwater.leetcode;


/**
 * 类  名: LeetcodeNo495
 * 描  述: LeetcodeNo495. 提莫攻击
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-09-11 16:02
 */
public class LeetcodeNo495 {

    // 在《英雄联盟》的世界中，有一个叫 “提莫” 的英雄。他的攻击可以让敌方英雄艾希（编者注：寒冰射手）进入中毒状态。
    //当提莫攻击艾希，艾希的中毒状态正好持续 duration 秒。
    //
    //正式地讲，提莫在 t 发起攻击意味着艾希在时间区间 [t, t + duration - 1]（含 t 和 t + duration - 1）处于中毒状态。
    // 如果提莫在中毒影响结束 前 再次攻击，中毒状态计时器将会 重置 ，在新的攻击之后，中毒影响将会在 duration 秒后结束。
    //
    //给你一个 非递减 的整数数组 timeSeries ，其中 timeSeries[i] 表示提莫在 timeSeries[i] 秒时对艾希发起攻击，以及一个表示中毒持续时间的整数 duration 。
    //返回艾希处于中毒状态的 总 秒数。
    public static void main(String[] args) {
        int[] timeSeries = new int[]{1, 4};
        int duration = 2;

        int durationSum = findPoisonedDuration2(timeSeries, duration);

        System.out.println("durationSum = " + durationSum);
    }

    public static int findPoisonedDuration2(int[] timeSeries, int duration) {
        int sum = 0;

        // 失效时间
        int expired = 0;

        for (int i = 0; i < timeSeries.length; i++) {
            int timeTemp = timeSeries[i];
            if (timeTemp > expired) {
                // 下一个中毒时间 大于失效时间
                sum += duration;
            } else {
                // 下一个中毒时间 小于有效时间
                sum += timeTemp - (expired - duration);
            }

            // 下一个失效时间
            expired = timeTemp + duration;
        }

        return sum;
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;

        // 转换列表为 0 1 表示的中毒时刻点
        int[] timeArr = new int[timeSeries[timeSeries.length - 1] + 1];
        for (int i = 0; i < timeSeries.length; i++) {
            timeArr[timeSeries[i]] = 1;
        }

        int durationTemp = 0;

        for (int i = 0; i < timeArr.length; i++) {
            // 当前中毒 更新中毒 持续时间
            if (timeArr[i] == 1) {
                durationTemp = duration;
            }

            // 中毒状态判断
            if (durationTemp > 0) {
                sum++;
                durationTemp--;
            }
        }

        // 最后剩余的中毒时间
        sum += durationTemp;

        return sum;
    }
}
