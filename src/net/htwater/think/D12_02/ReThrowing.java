package net.htwater.think.D12_02;

/**
 * Created by 96955 on 2019/4/29.
 */
public class ReThrowing {
    private static void f() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    private static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
            throw (Exception)e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {

        try {
            g();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
