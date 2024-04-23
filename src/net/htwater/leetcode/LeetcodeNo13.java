package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo13
 * 描  述: LeetcodeNo13. 罗马数字转整数
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-23 16:01
 */
public class LeetcodeNo13 {
    public static void main(String[] args) {
        String romanStr = "MCMXCIV";

        int num = romanToInt(romanStr);

        // 1994
        System.out.println(num);
    }

    public static int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = 0;
            switch (s.charAt(i) + "") {
                case "I":
                    if (i < s.length() - 1) {
                        String nextStr = s.charAt(i + 1) + "";
                        if ("V".equals(nextStr) || "X".equals(nextStr)) {
                            value = -1;
                        } else {
                            value = 1;
                        }
                    } else {
                        value = 1;
                    }
                    break;
                case "V":
                    value = 5;
                    break;
                case "X":
                    if (i < s.length() - 1) {
                        String nextStr = s.charAt(i + 1) + "";
                        if ("L".equals(nextStr) || "C".equals(nextStr)) {
                            value = -10;
                        } else {
                            value = 10;
                        }
                    } else {
                        value = 10;
                    }
                    break;
                case "L":
                    value = 50;
                    break;
                case "C":
                    if (i < s.length() - 1) {
                        String nextStr = s.charAt(i + 1) + "";
                        if ("D".equals(nextStr) || "M".equals(nextStr)) {
                            value = -100;
                        } else {
                            value = 100;
                        }
                    } else {
                        value = 100;
                    }
                    break;
                case "D":
                    value = 500;
                    break;
                case "M":
                    value = 1000;
                    break;
                default:
                    break;
            }

            num += value;
        }

        return num;
    }
}
