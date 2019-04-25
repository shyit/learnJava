package net.htwater.think.D10.D10_02;

/**
 * Created by 96955 on 2019/3/6.
 */
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
        }

        public void ff(){
            System.out.println("DotThis.f()");
        }

    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        Inner inner = dotThis.new Inner();
        Inner inner1 = new DotThis().new Inner();
        inner.outer().f();
    }
}
