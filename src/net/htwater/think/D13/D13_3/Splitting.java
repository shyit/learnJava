package net.htwater.think.D13.D13_3;

import java.util.Arrays;

/**
 * Created by 96955 on 2019/5/7.
 */
public class Splitting {
    private static String s = "hel/lo nice to meet you, my name is shy i come from china";

    public static void main(String[] args) {
        System.out.println(s);
        System.out.println(Arrays.toString(s.split(" ")));
        System.out.println(Arrays.toString(s.split("\\W+")));

    }
}
