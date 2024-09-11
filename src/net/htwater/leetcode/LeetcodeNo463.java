package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo463
 * 描  述: LeetcodeNo463. 岛屿的周长
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-09-11 10:51
 */
public class LeetcodeNo463 {

    // 给定一个 row x col 的二维网格地图 grid ，其中：grid[i][j] = 1 表示陆地， grid[i][j] = 0 表示水域。
    //网格中的格子 水平和垂直 方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。
    //岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。
    public static void main(String[] args) {
        int[][] grid = new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};

        int perimeter = islandPerimeter(grid);

        System.out.println("perimeter = " + perimeter);
    }

    public static int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        // 周长
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            int[] gridRow = grid[i];
            for (int j = 0; j < gridRow.length; j++) {
                // 当前位置如果是水域 跳过本次循环
                if (gridRow[j] == 0) {
                    continue;
                }

                // 左边
                if (j-1<0||grid[i][j-1]==0){
                    perimeter++;
                }

                // 右边
                if (j+1>=col||grid[i][j+1]==0){
                    perimeter++;
                }

                // 上边
                if (i-1<0||grid[i-1][j]==0){
                    perimeter++;
                }

                // 下边
                if (i+1>=row||grid[i+1][j]==0){
                    perimeter++;
                }
            }
        }

        return perimeter;
    }
}
