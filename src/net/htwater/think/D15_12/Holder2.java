package net.htwater.think.D15_12;

/**
 * Created by 96955 on 2019/7/3.
 */
public class Holder2 {
    private Object object;

    public void set(Object object){
        this.object=object;
    }

    public Object get() {
        return object;
    }

    public Holder2(Object object) {
        this.object = object;
    }

    public static void main(String[] args){
        Holder2 holder2=new Holder2(new Automobile());
        Automobile automobile= (Automobile) holder2.get();
        holder2.set("Not an Automobile");
        System.out.println(holder2.get());
    }
}
