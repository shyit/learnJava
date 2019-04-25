package net.htwater.think.D09.D09_05;

/**
 * Created by 96955 on 2019/2/22.
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory factory){
        Service service=factory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args){
        serviceConsumer(new ImplementionFactory());
    }


}

interface Service {
    void method1();

    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implemention1 implements Service {
    public Implemention1() {
    }

    @Override
    public void method1() {
        System.out.println("Implemention1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implemention1 method2");
    }
}

class Implemention2 implements Service {
    public Implemention2() {
    }

    @Override
    public void method1() {
        System.out.println("Implemention2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implemention2 method2");
    }
}

class ImplementionFactory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implemention1();
    }
}



