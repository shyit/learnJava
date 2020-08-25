package net.htwater.think.D14_11;

/**
 * Created by 96955 on 2019/6/16.
 */
public class B implements A{

    @Override
    public void f() {
        System.out.println("f()");
    }

    public void g() {
        System.out.println("g()");
    }

    protected void u() {
        System.out.println("protected u()");
    }

    void v() {
        System.out.println("package v()");
    }

    private void w() {
        System.out.println("private w()");
    }
}
