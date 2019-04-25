package net.htwater.think.D10.D10_03;

/**
 * Created by 96955 on 2019/3/8.
 */
public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("在实例初始化内部");
            }

            @Override
            public void f() {
                System.out.println("执行了匿名之类的f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(22);
        base.f();
    }
}

abstract class Base {
    public Base(int i) {
        System.out.println("Base Constructor,i=" + i);
    }

    public abstract void f();

}
