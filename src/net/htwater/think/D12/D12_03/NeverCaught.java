package net.htwater.think.D12.D12_03;

/**
 * Created by 96955 on 2019/4/30.
 */
public class NeverCaught {
    public static void main(String[] args){
        g();
    }

    static void f(){
        throw new RuntimeException("From f()");
    }

    static void g(){
        f();
    }
}
