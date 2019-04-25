package net.htwater.think.D10.D10_05;

/**
 * Created by 96955 on 2019/3/14.
 */
public class MuitiImplementation {
    static void takesD(D d) {

    }

    static void takesE(E e) {

    }

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}

class D {

}

abstract class E {

}

class Z extends D {
    E makeE() {
        return new E() {

        };
    }
}
