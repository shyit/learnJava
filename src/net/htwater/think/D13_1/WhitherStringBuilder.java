package net.htwater.think.D13_1;

/**
 * Created by 96955 on 2019/5/6.
 */
public class WhitherStringBuilder {
    public static void main(String[] args) {
        final int SIZE=50000;
        String[] fields=new String[SIZE];
        for (int i=0;i<SIZE;i++){
            fields[i]=i+"!";
        }

        System.out.println(implicit(fields));
        System.out.println(explicit(fields));

    }

    public static String implicit(String[] fields) {
        System.out.println(System.currentTimeMillis());
        String result = "";
        for (int i = 0; i < fields.length; i++) {
            result = result + fields[i];
        }
        System.out.println(System.currentTimeMillis());

        return result;
    }

    public static String explicit(String[] fields) {
        System.out.println(System.currentTimeMillis());

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            stringBuilder.append(fields[i]);
        }
        System.out.println(System.currentTimeMillis());

        return stringBuilder.toString();
    }
}
