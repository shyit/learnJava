package net.htwater.leetcode;


import java.util.Arrays;

/**
 * 类  名: LeetcodeNo455
 * 描  述: LeetcodeNo455. 分发饼干
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-09-11 10:32
 */
public class LeetcodeNo455 {
    // 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
    //
    //对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j] 。
    // 如果 s[j] >= g[i]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。
    // 你的目标是满足尽可能多的孩子，并输出这个最大数值。
    public static void main(String[] args) {
        int[] g = new int[]{4, 9, 5};
        int[] s = new int[]{9, 4, 9, 8, 4};

        int count = findContentChildren(g, s);

        System.out.println("count = " + count);
    }

    public static int findContentChildren(int[] g, int[] s) {
        // 胃口排序
        Arrays.sort(g);
        // 饼干排序
        Arrays.sort(s);

        int count = 0;

        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex < g.length && secondIndex < s.length) {
            if (g[firstIndex] <= s[secondIndex]) {
                // 胃口 小于等于 饼干 满足
                count++;
                firstIndex++;
                secondIndex++;
            } else {
                secondIndex++;
            }
        }

        return count;
    }
}
