package net.htwater.think.D11.D11_07;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by 96955 on 2019/4/18.
 */
public class Statistics {
    public static void main(String[] args){
        Random random=new Random(47);
        Map<Integer ,Integer> map=new HashMap<>();
        for (int i=0;i<10000;i++){
            int r=random.nextInt(20);
            Integer freq= map.get(r);
            if (null==freq){
                map.put(r,1);
            }else {
                map.put(r,freq+1);
            }
        }
        System.out.println(map);
    }
}
