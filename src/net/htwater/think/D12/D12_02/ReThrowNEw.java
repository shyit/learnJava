package net.htwater.think.D12.D12_02;

/**
 * Created by 96955 on 2019/4/29.
 */
public class ReThrowNEw {

    private static void f() throws OneException {
        System.out.println("origination the f()");
        throw new OneException("one throw from f()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (OneException e) {
            System.out.println("Caught in inner try e.printStackTrace()");
            e.printStackTrace();
            try {
                throw new TwoException("two throw from main()");
            } catch (TwoException e1) {
                e1.printStackTrace();
            }
        }
    }

}

class OneException extends Exception {
    public OneException(String message) {
        super(message);
    }
}

class TwoException extends Exception {
    public TwoException(String message) {
        super(message);
    }
}
