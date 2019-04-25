package net.htwater.think.D11.D11_06;

import java.util.*;

/**
 * Created by 96955 on 2019/4/17.
 */
public class SetOfInteger {
    public static void main(String[] args){
        Random random=new Random(47);
        Set<Integer> intSet=new HashSet<>();

        for (int i=0;i<10;i++){
            intSet.add(random.nextInt(40));
        }

        System.out.println(intSet);

    }
}
