package net.htwater.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 类  名: LeetcodeNo119
 * 描  述: LeetcodeNo119. 杨辉三角 II
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-06-27 21:15
 */
public class LeetcodeNo119 {

    public static void main(String[] args) {
        int numRow = 3;

        List<Integer> resultYangHui = getRow(numRow);


        for (int i = 0; i < resultYangHui.size(); i++) {
            System.out.print(resultYangHui.get(i));
        }
    }

    public static List<Integer> getRow(int rowIndex) {
        rowIndex++;

        List<Integer> rowList = new ArrayList<>();
        rowList.add(1);

        for (int i = 2; i <= rowIndex; i++) {
            rowList.add(0);
            for (int j = i - 1; j > 0; j--) {
                int temp = rowList.get(j - 1) + rowList.get(j);
                rowList.set(j,temp);
            }
        }

        return rowList;
    }


}
