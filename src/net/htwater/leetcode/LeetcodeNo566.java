package net.htwater.leetcode;

import java.util.Arrays;

/**
 * 类  名: LeetcodeNo566
 * 描  述: LeetcodeNo566. 重塑矩阵
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-09-18 09:47
 */
public class LeetcodeNo566 {

    // 在 MATLAB 中，有一个非常有用的函数 reshape ，它可以将一个 m x n 矩阵重塑为另一个大小不同（r x c）的新矩阵，但保留其原始数据。
    // 给你一个由二维数组 mat 表示的 m x n 矩阵，以及两个正整数 r 和 c ，分别表示想要的重构的矩阵的行数和列数。
    // 重构后的矩阵需要将原始矩阵的所有元素以相同的 行遍历顺序 填充。
    // 如果具有给定参数的 reshape 操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;

        int[][] matNew = matrixReshape(mat, r, c);

        for (int i = 0; i < matNew.length; i++) {
            int[] arrTemp = matNew[i];
            System.out.println(Arrays.toString(arrTemp));
        }
    }


    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int oldRr = mat.length;
        int oldCc = mat[0].length;

        // 判断 reshape 操作是可行且合理的
        if (oldRr * oldCc != r * c) {
            return mat;
        }

        int[][] matNew = new int[r][c];

        // 对应数值赋值
        for (int i = 0; i < oldRr * oldCc; i++) {
            matNew[i / c][i % c ] = mat[i / oldCc][i % oldCc ];
        }

        return matNew;
    }
}
