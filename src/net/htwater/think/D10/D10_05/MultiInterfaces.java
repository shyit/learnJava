package net.htwater.think.D10.D10_05;

/**
 * Created by 96955 on 2019/3/14.
 */
public class MultiInterfaces {
    static void takesA(A a){

    }

    static void takesB(B b){

    }

    public static void main(String[] args){
        X x=new X();
        Y y=new Y();

        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }

}

interface A{

}

interface B{

}

class X implements A,B{

}

class Y implements A{
    B makeB(){
        return new B(){

        };
    }
}
