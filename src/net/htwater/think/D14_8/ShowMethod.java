package net.htwater.think.D14_8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * Created by 96955 on 2019/5/13.
 */
public class ShowMethod {
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("net.htwater.think.D14_8.ShowMethod");
            Method[] methods = c.getMethods();
            Constructor[] constructors = c.getConstructors();
            for (Method method : methods) {
                System.out.println("method=" + p.matcher(method.toString()).replaceAll(""));
            }
            for (Constructor constructor : constructors) {
                System.out.println("constructor=" + p.matcher(constructor.toString()).replaceAll(""));
            }
        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
            System.out.println("No such Class: " + e);
        }
    }
}
