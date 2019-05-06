package net.htwater.think.D12.D12_03;

/**
 * Created by 96955 on 2019/4/30.
 */
public class WithFinally {
    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {
        throw new OnOffException1();
    }

    public static void main(String[] args) {

        try {
            sw.on();
            f();
            sw.off();
        } catch (OnOffException1 onOffException1) {
            System.out.println("onOffException1");
            sw.off();
            onOffException1.printStackTrace();
        } catch (OnOffException2 onOffException2) {
            System.out.println("onOffException2");
            sw.off();
            onOffException2.printStackTrace();
        }
    }

}

class OnOffException1 extends Exception {

}

class OnOffException2 extends Exception {

}