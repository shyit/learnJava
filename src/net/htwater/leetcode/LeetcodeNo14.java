package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo14
 * 描  述: LeetcodeNo14. 最长公共前缀
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-23 16:36
 */
public class LeetcodeNo14 {
//    编写一个函数来查找字符串数组中的最长公共前缀。
//    如果不存在公共前缀，返回空字符串 ""。
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};

        String publicSub = longestCommonPrefix2(strs);

        // fl
        System.out.println(publicSub);
    }

    // 纵向比较
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return "";
        }

        String publicSub = "";
        String strFirst = strs[0];

        for (int i = 0; i < strFirst.length(); i++) {
            String strNow = strFirst.charAt(i) + "";
            for (int j = 0; j < strs.length; j++) {
                if (!(i < strs[j].length()) || !(strNow.equals(strs[j].charAt(i) + ""))) {
                    return publicSub;
                }
            }
            publicSub += strNow;
        }

        return publicSub;
    }

    // 横向比较
    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null) {
            return "";
        }

        String prefixStr = strs[0];

        for (int i = 0; i < strs.length; i++) {
            prefixStr = getPreFix(prefixStr, strs[i]);
            if ("".equals(prefixStr)) {
                return "";
            }
        }

        return prefixStr;
    }

    // 获取前缀
    private static String getPreFix(String prefixStr, String str) {
        String prefix = "";

        for (int i = 0; i < prefixStr.length(); i++) {
            String strNow = prefixStr.charAt(i) + "";
            if (!(i < str.length()) || !(strNow.equals(str.charAt(i) + ""))) {
                return prefix;
            }
            prefix += strNow;
        }

        return prefix;
    }
}
