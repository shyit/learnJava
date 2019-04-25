package net.htwater.think.D10.D10_04;

/**
 * Created by 96955 on 2019/3/14.
 */
public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {

        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
