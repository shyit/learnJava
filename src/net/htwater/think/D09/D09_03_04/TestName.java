package net.htwater.think.D09.D09_03_04;

/**
 * Created by 96955 on 2019/2/20.
 */
public class TestName implements I1, I2 {

    @Override
    public void f() {

    }

    @Override
    public int f(int i) {
        return 0;
    }
}

interface I1 {
    void f();
}

interface I2 {
    int f(int i);
}

interface I3 {
    int f();
}

