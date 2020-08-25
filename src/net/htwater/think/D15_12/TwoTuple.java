package net.htwater.think.D15_12;

/**
 * Created by 96955 on 2019/7/3.
 */
public class TwoTuple<A,B> {
    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public String toString(){
        return "("+first+","+second+")";
    }

    public static void main(String[] args){
        TwoTuple<String,Integer> twoTuple=new TwoTuple<>("key",12);
        System.out.println(twoTuple);
    }

}
