package net.htwater.think.D12.D12_03;

/**
 * Created by 96955 on 2019/4/30.
 */
public class FinallyWork {

    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                if (count++ != 0) {
                    throw new ThreeException();
                }
                System.out.println("No Exception");
            } catch (ThreeException e) {
                System.out.println("Exception");
            } finally {
                System.out.println("finally");
                if (count==3){
                    break;
                }
            }
        }
    }

    private static void f() {

    }
}

class ThreeException extends Exception {

}
