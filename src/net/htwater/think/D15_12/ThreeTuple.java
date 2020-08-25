package net.htwater.think.D15_12;

/**
 * Created by 96955 on 2019/7/3.
 */
public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {

    public final C third;

    public ThreeTuple(A first, B second,C third) {
        super(first, second);
        this.third=third;
    }

    @Override
    public String toString() {
        return "("+first+","+second+","+third+")";
    }

    public static void main(String[] args){
        ThreeTuple<Integer,Double,String> threeTuple=new ThreeTuple<>(1,1.1,"abc");
        System.out.println(threeTuple);
    }
}
