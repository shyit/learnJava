package net.htwater.think.D10.D10_05;

/**
 * Created by 96955 on 2019/3/14.
 */
public class callbacks {
    public static void main(String[] args){
        Callee1 callee1=new Callee1();
        Callee2 callee2=new Callee2();
        MyIncrement.f(callee2);
    }
}

interface Incrementable {
    void increment();
}

class Callee1 implements Incrementable {

    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println("i=" + i);
    }
}

class MyIncrement {
    public void increment() {
        System.out.println("Other operation");
    }

    static void f(MyIncrement myIncrement) {
        myIncrement.increment();
    }
}

class Callee2 extends MyIncrement {
    private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println("i=" + i);
    }

    private class Closure implements Incrementable {

        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference() {
        return new Closure();
    }
}

class Caller {
    private Incrementable callbackReference;

    Caller(Incrementable callbackReference) {
        this.callbackReference = callbackReference;
    }

    void go(){
        callbackReference.increment();
    }
}


