package net.htwater.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 类  名: LeetcodeNo506
 * 描  述: LeetcodeNo506. 相对名次
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-09-13 11:53
 */
public class LeetcodeNo506 {

    // 给你一个长度为 n 的整数数组 score ，其中 score[i] 是第 i 位运动员在比赛中的得分。所有得分都 互不相同 。
    //运动员将根据得分 决定名次 ，其中名次第 1 的运动员得分最高，名次第 2 的运动员得分第 2 高，依此类推。运动员的名次决定了他们的获奖情况：
    //名次第 1 的运动员获金牌 "Gold Medal" 。
    //名次第 2 的运动员获银牌 "Silver Medal" 。
    //名次第 3 的运动员获铜牌 "Bronze Medal" 。
    //从名次第 4 到第 n 的运动员，只能获得他们的名次编号（即，名次第 x 的运动员获得编号 "x"）。
    //使用长度为 n 的数组 answer 返回获奖，其中 answer[i] 是第 i 位运动员的获奖情况。
    public static void main(String[] args) {
        int[] score = new int[]{10, 3, 8, 9, 4};

        String[] relativeRanks = findRelativeRanks(score);

        // relativeTanks = [Gold Medal, 5, Bronze Medal, Silver Medal, 4]
        System.out.println("relativeTanks = " + Arrays.toString(relativeRanks));
    }

    public static String[] findRelativeRanks(int[] score) {
        int[] scoreNew = Arrays.stream(score).toArray();

        // 排序 但是按照升序的 后面需要特别处理
        Arrays.sort(scoreNew);

        // 把得分和序号放入hashMap 方便下面 使用
        // 应为是升序的 所有排名需要处理下
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < scoreNew.length; i++) {
            map.put(scoreNew[i], scoreNew.length - i);
        }

        String[] relativeRanks = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            // 通过map 读取排名
            int rank = map.get(score[i]);
            String rankStr = rank + "";
            if (1 == rank) {
                rankStr = "Gold Medal";
            }
            if (2 == rank) {
                rankStr = "Silver Medal";
            }
            if (3 == rank) {
                rankStr = "Bronze Medal";
            }
            relativeRanks[i] = rankStr;
        }

        return relativeRanks;
    }

}
