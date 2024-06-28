package net.htwater.leetcode;


/**
 * 类  名: LeetcodeNo121
 * 描  述: LeetcodeNo121. 买卖股票的最佳时机
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-06-28 14:59
 */
public class LeetcodeNo121 {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int profit = maxProfit(prices);

        System.out.println("maxProfit = " + profit);
    }

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int nowPrice = prices[i];
            if (nowPrice < minPrice) {
                minPrice = nowPrice;
            } else {
                int profit = nowPrice - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;

//        int minprice = Integer.MAX_VALUE;
//        int maxprofit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < minprice) {
//                minprice = prices[i];
//            } else if (prices[i] - minprice > maxprofit) {
//                maxprofit = prices[i] - minprice;
//            }
//        }
//        return maxprofit;

    }
}
