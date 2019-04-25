package net.htwater.think.D10.D10_06;

/**
 * Created by 96955 on 2019/3/15.
 */
public class BigEgg extends Egg {

    protected class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }

        public void f(){
            System.out.println("BigEgg.Yolk.f()");
        }
    }

    public static void main(String[] args) {
//        new BigEgg.new Yolk().f();
    }

}

class Egg {
    private Yolk yolk;

    public Egg() {
        System.out.println("New Egg");
        yolk = new Yolk();
    }

    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
        public void f(){
            System.out.println("Egg.Yolk.f()");
        }
    }
}
