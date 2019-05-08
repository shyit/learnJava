package net.htwater.think.D13_3;

/**
 * Created by 96955 on 2019/5/7.
 */
public class IntegerMatch {

    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("--1234".matches("-?\\d+"));
        System.out.println("1234".matches("(-|\\+)?\\d+"));
    }
}
