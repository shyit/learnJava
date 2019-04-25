package net.htwater.think.D09.D09_04;

import java.util.Random;

/**
 * Created by 96955 on 2019/2/21.
 */
public class RandomDouble {
    private static Random random = new Random(47);

    public double next() {
        return random.nextDouble();
    }

    public static void main(String[] args) {
        RandomDouble randomDouble = new RandomDouble();
        for (int i = 0; i < 10; i++) {
            System.out.println(randomDouble.next());
        }

    }

}
