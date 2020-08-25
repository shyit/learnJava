package net.htwater.think.D15_12;

/**
 * Created by 96955 on 2019/7/3.
 */
public class TupleTest {
    static TwoTuple<String,Amphibian> f(){
        return new TwoTuple<String,Amphibian>("hi",new Amphibian());
    }

    public static void main(String[] args){
        TwoTuple<String,Amphibian> twoTuple=f();
        System.out.println(twoTuple);
    }
}

class Amphibian{

}

class Vehicle{

}
