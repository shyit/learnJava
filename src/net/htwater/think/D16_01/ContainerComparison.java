package net.htwater.think.D16_01;

import java.util.Arrays;

/**
 * Created by 96955 on 2019/8/17.
 */
public class ContainerComparison {
    public static void main(String[] args){
        BerrlliumSphere[] berrlliumSpheres=new BerrlliumSphere[10];

        for (int i=0;i<5;i++){
            berrlliumSpheres[i]=new BerrlliumSphere();
        }

        for (int i=0;i<10;i++){
            System.out.println(berrlliumSpheres[i]);
        }

        System.out.println(berrlliumSpheres);

        System.out.println(Arrays.toString(berrlliumSpheres));

    }
}

class BerrlliumSphere{
    private static long counter;

    private final long id=counter++;

    @Override
    public String toString() {
        return "Shpere "+id;
    }
}