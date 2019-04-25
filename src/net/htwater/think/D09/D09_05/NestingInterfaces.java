package net.htwater.think.D09.D09_05;

/**
 * Created by 96955 on 2019/2/22.
 */
public class NestingInterfaces {

    public class Bimp implements A.B {
        @Override
        public void f() {

        }
    }

    public class CImp implements A.E.G{

        @Override
        public void f() {

        }
    }

    public static void main(String[] args) {
        A a=new A();
        a.receiveD(a.getD());
    }

}

class A {
    interface B {
        void f();
    }

    interface C {
        void f();
    }

    private interface D {
        void f();
    }

    interface E {
        interface G {
            void f();
        }

        public interface H {
            void f();
        }
    }

    public class BImp implements B {

        @Override
        public void f() {

        }
    }

    public class BImp2 implements B {

        @Override
        public void f() {

        }
    }

    class CImp implements C {

        @Override
        public void f() {

        }
    }

    private class CImp2 implements C {

        @Override
        public void f() {

        }
    }

    private class DImp implements D {

        @Override
        public void f() {

        }
    }

    public class DImp2 implements D {

        @Override
        public void f() {

        }
    }

    public D getD() {
        return new DImp2();
    }

    private D dRef;

    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}
