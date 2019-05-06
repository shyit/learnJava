package net.htwater.think.D12.D12_1;

/**
 * Created by 96955 on 2019/4/24.
 */
public class InheritingException {
    public static void main(String[] args) {
        InheritingException inheritingException=new InheritingException();
        try {
            inheritingException.f();
        } catch (SimpleException e) {
            e.printStackTrace();
        }
    }

    public void f() throws SimpleException {
        System.out.println("Throw SimpleException!");
        throw new SimpleException();
    }
}

class SimpleException extends Exception {

}
