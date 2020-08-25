package net.htwater.think.D15_14;

/**
 * Created by 96955 on 2019/7/3.
 */
public class GenericMethods {
    public <T> void f(T t){
        System.out.println(t.getClass().getSimpleName());
    }

    public static void main(String[] args){
        GenericMethods genericMethods=new GenericMethods();
        genericMethods.f(genericMethods);
        genericMethods.f(1);
        genericMethods.f(1.1);

    }
}
