package net.htwater.think.D14_9;

/**
 * Created by 96955 on 2019/5/13.
 */
public class SimpleProxyTest {
    public static void consumer(HtInterface htInterface) {
        htInterface.doSomething();
        htInterface.somethingElse();
    }

    public static void main(String[] args){
        consumer(new realObject());
        System.out.println("=========================");
        consumer(new SimpleProxy(new realObject()));

    }
}

class realObject implements HtInterface {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse() {
        System.out.println("somethingElse");
    }
}

class SimpleProxy implements HtInterface {

    private HtInterface proxied;

    public SimpleProxy(HtInterface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse() {
        System.out.println("SimpleProxy somethingElse");
        proxied.somethingElse();
    }
}

interface HtInterface {
    void doSomething();

    void somethingElse();
}
