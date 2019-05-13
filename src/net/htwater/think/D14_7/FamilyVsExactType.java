package net.htwater.think.D14_7;

/**
 * Created by 96955 on 2019/5/11.
 */
public class FamilyVsExactType {

    static void test(Object x) {
        System.out.println("Base.class:: " + Base.class);
        System.out.println("Derived.class:: " + Derived.class);
        System.out.println("Testing x of to type ::" + x.getClass());
        System.out.println("x instanceof Base:: " + (x instanceof Base));
        System.out.println("x instanceof Derived:: " + (x instanceof Derived));
        System.out.println("x instanceof Base:: " + Base.class.isInstance(x));
        System.out.println("x instanceof Derived:: " + Derived.class.isInstance(x));
        System.out.println("+++++++++++++++++++++++");
        System.out.println("x.getClass()== Base.class:: " + (x.getClass() == Base.class));
        System.out.println("x.getClass()== Derived.class:: " + (x.getClass() == Derived.class));
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        test(base);
        test(derived);
    }
}

class Base {

}

class Derived extends Base {

}
