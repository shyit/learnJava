package net.htwater.think.D13_1;

/**
 * Created by 96955 on 2019/5/6.
 */
public class Concatenation {
    public static void main(String[] args){
        String mango="mango";
        String s="abc"+mango+"def"+47;
        System.out.println(s);

        StringBuilder stringBuilder=new StringBuilder("abc");
        stringBuilder.append("def");
        System.out.println(stringBuilder);
    }
}
