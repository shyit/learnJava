package net.htwater.think.D12_02;

/**
 * Created by 96955 on 2019/4/29.
 */
public class WhoCalled {
    private static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
        f();
    }
}
