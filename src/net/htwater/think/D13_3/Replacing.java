package net.htwater.think.D13_3;

/**
 * Created by 96955 on 2019/5/7.
 */
public class Replacing {
    private static String s = "hel/lo nice to meet you, my name is shy i cnome from china";

    public static void main(String[] args) {
        System.out.println(s.replaceAll("[a-e]","##"));
    }
}
