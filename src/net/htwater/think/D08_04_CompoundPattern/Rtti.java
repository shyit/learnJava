package net.htwater.think.D08_04_CompoundPattern;

/**
 * Created by 96955 on 2019/1/3.
 */
public class Rtti {
    public static void main(String[] args){
        Useful[] list={new Useful(),new MoreUseful()};
        list[0].f();
        ((MoreUseful)list[1]).v();
        ((MoreUseful)list[0]).v();
    }

}

class Useful {
    public void f() {

    }

    public void g() {

    }
}

class MoreUseful extends Useful {

    @Override
    public void f() {

    }

    @Override
    public void g() {

    }

    public void u() {

    }

    public void v() {

    }

    public void w() {

    }

}
