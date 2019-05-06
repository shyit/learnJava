package net.htwater.think.D13_2;

import java.util.ArrayList;

/**
 * Created by cambrian on 2019/5/6.
 */
public class InfiniteRecursion {

    @Override
    public String toString() {
//        return "InfiniteRecursion address "+super.toString()+"\n";
        return "InfiniteRecursion address "+this+"\n";
//        return "InfiniteRecursion address "+"\n";
     }

    public static void main(String[] args){
        System.out.println(new InfiniteRecursion());
    }
}
