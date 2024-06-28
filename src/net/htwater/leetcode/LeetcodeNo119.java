package net.htwater.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 类  名: LeetcodeNo118
 * 描  述: LeetcodeNo118. 杨辉三角 II
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-06-27 21:15
 */
public class LeetcodeNo119 {

    public static void main(String[] args) {
        int numRow = 5;

        List<Integer> resultYangHui = getRow(numRow);


        for (int i = 0; i < resultYangHui.size(); i++) {
            System.out.print(resultYangHui.get(i));
        }
    }

    public static List<Integer> getRow(int rowIndex) {
        rowIndex++;

        List<List<Integer>> resultList = new ArrayList<>();

        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        resultList.add(firstList);

        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> preItemList = resultList.get(i - 1 - 1);
            List<Integer> itemList = new ArrayList<>();

            itemList.add(1);
            for (int j = 1; j < i - 1; j++) {
                int temp = preItemList.get(j - 1) + preItemList.get(j);
                itemList.add(temp);
            }
            itemList.add(1);
            resultList.add(itemList);
        }

        return resultList.get(resultList.size() - 1);
    }


}
