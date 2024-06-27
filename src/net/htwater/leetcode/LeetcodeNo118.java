package net.htwater.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 类  名: LeetcodeNo118
 * 描  述: LeetcodeNo118. 杨辉三角
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-06-27 21:15
 */
public class LeetcodeNo118 {

    public static void main(String[] args) {
        int numRow = 5;

        List<List<Integer>> resultYangHui = generate(numRow);


        for (int i = 0; i < resultYangHui.size(); i++) {
            List<Integer> itemList = resultYangHui.get(i);
            for (int j = 0; j < itemList.size(); j++) {
                System.out.print(itemList.get(j));
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();

        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        resultList.add(firstList);

        for (int i = 2; i <= numRows; i++) {
            List<Integer> preItemList = resultList.get(i-1-1);
            List<Integer> itemList = new ArrayList<>();

            itemList.add(1);
            for (int j = 1; j < i-1; j++) {
                int temp = preItemList.get(j-1) + preItemList.get(j);
                itemList.add(temp);
            }
            itemList.add(1);
            resultList.add(itemList);
        }

        return resultList;
    }
}
