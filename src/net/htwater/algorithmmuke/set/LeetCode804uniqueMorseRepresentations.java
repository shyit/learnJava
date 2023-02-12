package net.htwater.algorithmmuke.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 类  名: LeetCode804uniqueMorseRepresentations
 * 描  述: 804. 唯一摩尔斯密码词
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2023-02-12 18:52
 */
public class LeetCode804uniqueMorseRepresentations {

    public int uniqueMorseRepresentations(String[] words) {
        TreeSet<String> morseSet = new TreeSet<>();

        for (String word : words) {
            String morse = parseMorse(word);
            morseSet.add(morse);
        }

        return morseSet.size();

    }

    private String parseMorse(String word) {
        String[] morseTable = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        char[] wordChars = word.toCharArray();
        int aValue = Character.getNumericValue('a');

        String morseStr = "";
        for (char wordChar : wordChars) {
            String morse = morseTable[wordChar - 'a'];
            morseStr += morse;
        }
        return morseStr;
    }

    public static void main(String[] args) {

    }
}
