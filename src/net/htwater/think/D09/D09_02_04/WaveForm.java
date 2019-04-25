package net.htwater.think.D09.D09_02_04;

/**
 * Created by 96955 on 2019/2/15.
 */
public class WaveForm {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Waveform" + id;
    }
}
