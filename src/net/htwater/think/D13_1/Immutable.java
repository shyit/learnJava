package net.htwater.think.D13_1;

/**
 * Created by 96955 on 2019/5/6.
 */
public class Immutable {

    public static void main(String[] args){
        String s1="howdy";
        System.out.println(s1);

        String s2=upcase(s1);

        System.out.println(s1);
        System.out.println(s2);
    }

    public static String upcase(String s){
        return s.toUpperCase();
    }
}
