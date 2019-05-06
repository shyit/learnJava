package net.htwater.think.P.P156;

/**
 * Created by 96955 on 2019/1/8.
 */
public class PrintOverride {
    private void f() {
        System.out.println("private f()");
    }

    public void g() {
        System.out.println("public g()");
    }

    public static void main(String[] args) {
        PrintOverride printOverride = new Derived();
        printOverride.f();
        printOverride.g();
    }
}

class Derived extends PrintOverride {
    //    @Override 因为没有继承，所以无法添加@Override标注
    public void f() {
        System.out.println("public f()");
    }

    @Override
    public void g() {
        System.out.println("public g()2");
    }
}
