package net.htwater.think.D14_11;

/**
 * Created by 96955 on 2019/6/16.
 */
public class InterfaceViolation {
    public static void main(String[] args) {

        A a = new B();
        a.f();
        System.out.println(a.getClass().getName());

        if (a instanceof B) {
            B b = (B) a;
            b.g();
        }

    }
}
