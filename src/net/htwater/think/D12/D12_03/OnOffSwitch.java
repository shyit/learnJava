package net.htwater.think.D12.D12_03;

/**
 * Created by 96955 on 2019/4/30.
 */
public class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {
//        throw new OnOffException1();
    }

    public static void main(String[] args) {

        try {
            sw.on();
            f();
        } catch (OnOffException1 onOffException1) {
            System.out.println("onOffException11");
            onOffException1.printStackTrace();
        } catch (OnOffException2 onOffException2) {
            System.out.println("onOffException22");
            onOffException2.printStackTrace();
        }finally {
            sw.off();
        }
    }

}

//class OnOffException1 extends Exception {
//
//}
//
//class OnOffException2 extends Exception {
//
//}