package net.htwater.think.D14_11.test;

import net.htwater.think.D14_11.A;
import net.htwater.think.D14_11.B;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by 96955 on 2019/6/16.
 */
public class test {
    public static void main(String[] args) {
        A a = new B();
        a.f();

        System.out.println(a.getClass().getName());

        if (a instanceof B) {
            B b = (B) a;
            b.g();
        }

        callHiddenMethod(a,"u");
        callHiddenMethod(a,"v");
        callHiddenMethod(a,"w");
    }

    public static void callHiddenMethod(Object a,String methodName){
        Method m = null;
        try {
            m = a.getClass().getDeclaredMethod(methodName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        m.setAccessible(true);
        try {
            m.invoke(a);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}

