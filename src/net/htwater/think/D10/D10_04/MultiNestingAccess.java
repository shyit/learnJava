package net.htwater.think.D10.D10_04;

/**
 * Created by 96955 on 2019/3/14.
 */
public class MultiNestingAccess {
    public static void main(String[] args){
        MNA mna=new MNA();
        MNA.A mnaa=mna.new A();
        MNA.A.B mnaab=mnaa.new B();
        mnaab.h();
    }
}

class MNA{
    private void f(){

    }

    class A{
        private void g(){

        }

        public class B{
            void h(){
                g();
                f();
            }
        }
    }
}
