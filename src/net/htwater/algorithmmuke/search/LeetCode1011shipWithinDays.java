package net.htwater.algorithmmuke.search;

/**
 * 类  名: LeetCode1011shipWithinDays
 * 描  述: 1011. 在 D 天内送达包裹的能力
 * 
 * 功  能: 
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2023-02-10 16:07
 */
public class LeetCode1011shipWithinDays {
    public static int shipWithinDays(int[] weights, int days) {
        int weightsSum = 0;
        int weightMax = weights[0];
        for (int i = 0; i < weights.length; i++) {
            weightsSum += weights[i];
            if (weightMax < weights[i]) {
                weightMax = weights[i];
            }
        }

        return findShipWithinDays(weights, days, weightMax, weightsSum);
    }

    private static int findShipWithinDays(int[] weights, int days, int start, int end) {
        if (start == end) {
            return start;
        }

        int middle = (start + end) / 2;

        int shipWithinDays = 0;
        int weightSum = 0;
        for (int i = 0; i < weights.length; i++) {
            int weight = weights[i];
            weightSum += weight;
            if (weightSum == middle) {
                shipWithinDays++;
                weightSum = 0;
            } else if (weightSum > middle) {
                shipWithinDays++;
                weightSum = weight;
            }
        }

        if (weightSum != 0) {
            shipWithinDays++;
        }

        if (shipWithinDays <= days) {
            return findShipWithinDays(weights, days, start, middle);
        } else {
            return findShipWithinDays(weights, days, middle + 1, end);
        }

    }

    public static void main(String[] args) {
        int[] weights = new int[]{1,2,3,1,1};
        int days = 4;
        int minShipWIth = shipWithinDays(weights, days);
        System.out.println("minShipWIth=" + minShipWIth);
    }
}
