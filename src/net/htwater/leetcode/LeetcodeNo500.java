package net.htwater.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 类  名: LeetcodeNo500
 * 描  述: LeetcodeNo500. 键盘行
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-09-13 10:58
 */
public class LeetcodeNo500 {

    // 给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。键盘如下图所示。
    // 第一行由字符 "qwertyuiop" 组成。
    // 第二行由字符 "asdfghjkl" 组成。
    // 第三行由字符 "zxcvbnm" 组成。
    public static void main(String[] args) {
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};

        String[] result = findWords(words);

        System.out.println("result = " + Arrays.toString(result));
    }

    public static String[] findWords(String[] words) {
        List<String> wordList = new ArrayList<>();

        String codeStr = "12210111011122000010020202";

        for (int i = 0; i < words.length; i++) {
            String wordOriginal = words[i];
            String word = wordOriginal.toLowerCase();

            // 是否同一行flag
            boolean sameFlag = true;

            // 第一个字母的code
            int codeFirst = codeStr.charAt(word.charAt(0) - 'a');

            for (int j = 0; j < word.length(); j++) {
                char letter = word.charAt(j);
                int codeIndex = letter - 'a';
                int code = codeStr.charAt(codeIndex);
                if (code != codeFirst) {
                    sameFlag = false;
                    break;
                }
            }
            if (sameFlag) {
                wordList.add(wordOriginal);
            }
        }

        String[] result = wordList.toArray(new String[wordList.size()]);

        return result;
    }
}
