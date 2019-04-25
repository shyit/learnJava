package net.htwater.think.D09.D09_02;

/**
 * Created by 96955 on 2019/1/7.
 */
public class WaveForm {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "WaveForm " + id;
    }
}

