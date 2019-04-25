package net.htwater.think.D10.D10_06;

/**
 * Created by 96955 on 2019/3/15.
 */
public class InheritInner extends WithInner.Inner{
    InheritInner(WithInner withInner){
        withInner.super();
    }

    public static void main(String[] args){
        WithInner withInner=new WithInner();
        InheritInner inheritInner=new InheritInner(withInner);

    }

}

class WithInner{
    class Inner{

    }
}
