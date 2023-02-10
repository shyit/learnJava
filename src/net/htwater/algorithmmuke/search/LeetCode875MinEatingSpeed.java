package net.htwater.algorithmmuke.search;

/**
 * 类  名: LeetCode875MinEatingSpeed
 * 描  述: 875. 爱吃香蕉的珂珂
 * 
 * 功  能: 
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2023-02-10 12:17
 */
public class LeetCode875MinEatingSpeed {
    public static int minEatingSpeed(int[] piles, int h) {
        int maxEatSpeed = piles[0];
        for (int i = 0; i < piles.length; i++) {
            int eatSpeed = piles[i];
            if (maxEatSpeed < eatSpeed) {
                maxEatSpeed = eatSpeed;
            }
        }

        return findMiniEatSpeed(piles, h, 1, maxEatSpeed);
    }

    private static int findMiniEatSpeed(int[] piles, int h, int start, int end) {
        if (start == end) {
            return start;
        }

        int middle = (start + end) / 2;

        int eatTimeSum = 0;
        for (int i = 0; i < piles.length; i++) {
            int pile = piles[i];
            if (pile % middle == 0) {
                eatTimeSum += pile / middle;
            } else {
                eatTimeSum += pile / middle + 1;
            }
        }

        if (eatTimeSum <= h) {
            return findMiniEatSpeed(piles, h, start, middle);
        } else {
            return findMiniEatSpeed(piles, h, middle + 1, end);
        }

    }

    public static void main(String[] args) {
        int[] piles=new int[]{30,11,23,4,20};
        int h = 6;
        int minSpeed = minEatingSpeed(piles, h);
        System.out.println("minSpeed=" + minSpeed);
    }
}
