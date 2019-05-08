package net.htwater.think.D13_3;

/**
 * Created by cambrian on 2019/5/7.
 */
public class Replacing {

    private static String s="hello world hello nice to meet you. google to baidu gaode.";

    public static void main(String[] args){
        System.out.println(s);
        System.out.println(s.replaceAll("h\\w+","##"));
        System.out.println(s.replaceAll("\\s","??"));

    }
}
