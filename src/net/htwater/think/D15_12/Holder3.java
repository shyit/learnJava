package net.htwater.think.D15_12;

/**
 * Created by 96955 on 2019/7/3.
 */
public class Holder3<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Holder3(T t) {
        this.t = t;
    }

    public static void main(String[] args){
        Holder3<Automobile> holder3=new Holder3<>(new Automobile());
        Automobile automobile=holder3.getT();
        System.out.println(holder3.getT());
    }
}
