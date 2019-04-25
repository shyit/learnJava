package net.htwater.think.D09.D09_02_04;

/**
 * Created by 96955 on 2019/2/15.
 */
public class HeighPass extends Filter {
    double cutoff;

    public HeighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public WaveForm process(WaveForm input) {
        return input;
    }
}
