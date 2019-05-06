package net.htwater.think.P.P157;

/**
 * Created by 96955 on 2019/1/8.
 */
public class StaticPolymorphism {

    public static void main(String[] args) {
        StaticSuper staticSuper = new StaticSub();
        System.out.println(staticSuper.staticGet());
        System.out.println(staticSuper.dynamicGet());
    }
}

class StaticSuper {
    public static String staticGet() {
        return "Base staticGet";
    }

    public String dynamicGet() {
        return "Base dynamicGet";
    }
}

class StaticSub extends StaticSuper {
    //    @Override 因为没有继承，所以无法添加@Override标注
    public static String staticGet() {
        return "Derived staticGet";
    }

    @Override
    public String dynamicGet() {
        return "Derived dynamicGet";
    }
}
