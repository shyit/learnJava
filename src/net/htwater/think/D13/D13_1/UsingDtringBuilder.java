package net.htwater.think.D13.D13_1;

import java.util.Random;

/**
 * Created by 96955 on 2019/5/6.
 */
public class UsingDtringBuilder {

    public static Random random=new Random(47);

    public String toString(){
        StringBuilder stringBuilder=new StringBuilder("[");
        for (int i=0;i<25;i++){
            stringBuilder.append(random.nextInt(100));
            stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static void main(String[] args){
        System.out.println(new UsingDtringBuilder().toString());
    }
}

