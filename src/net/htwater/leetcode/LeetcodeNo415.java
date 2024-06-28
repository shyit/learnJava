package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo415
 * 描  述: LeetcodeNo415. 字符串相加
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-05-02 04:28
 */
public class LeetcodeNo415 {

    //    给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并同样以字符串形式返回。
    //    你不能使用任何內建的用于处理大整数的库（比如 BigInteger）， 也不能直接将输入的字符串转换为整数形式。
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";

        String result = addStrings(num1, num2);

        // 134
        System.out.println(result);
    }

    public static String addStrings(String num1, String num2) {
        // num1 数组长度
        int lengthOne = num1.length();
        // num2 数组长度
        int lengthTwo = num2.length();

        int lengthMax = lengthOne;
        if (lengthTwo > lengthOne) {
            lengthMax = lengthTwo;
        }

        char[] resultChar = new char[lengthMax];

        int index = 0;

        int addNum = 0;
        while (index < lengthOne || index < lengthTwo) {
            char charOne = '0';
            if (index < lengthOne) {
                charOne = num1.charAt(lengthOne - 1 - index);
            }

            char charTwo = '0';
            if (index < lengthTwo) {
                charTwo = num2.charAt(lengthTwo - 1 - index);
            }

            int one = charOne - '0';
            int two = charTwo - '0';

            int result = one + two + addNum;

            addNum = result / 10;

            result %= 10;
            resultChar[lengthMax - 1 - index] = (result + "").charAt(0);

            index++;
        }

        String resultStr = new String(resultChar);

        // 判断是否有最有一位进位
        if (addNum == 1) {
            resultStr = "1" + resultStr;
        }

        return resultStr;
    }
}
