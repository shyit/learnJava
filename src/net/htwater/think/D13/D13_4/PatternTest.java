package net.htwater.think.D13.D13_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by cambrian on 2019/5/7.
 */
public class PatternTest {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("me");
        Matcher matcher = pattern.matcher("nice to meet yomeu meent");
        while (matcher.find()) {
            System.out.println("Matcher \"" + matcher.group() + "\" at positions "
                    + matcher.start() + "-" + matcher.end());
        }
    }
}
