package net.htwater.algorithm;

/**
 * Created by cambrian on 2019/4/19.
 */
public class HanoiTest {
    public static void main(String[] args) {
        hanoi(3, "L", "M", "R");
    }

    public static void hanoi(int n, String a, String b, String c) {
        if (1 == n) {
            System.out.println("第1个盘子，从" + a + "移动到" + c);
        } else {
            hanoi(n - 1, a, c, b);
            System.out.println("第" + n + "个盘子，从" + a + "移动到" + c);
            hanoi(n - 1, b, a, c);
        }
    }
}
