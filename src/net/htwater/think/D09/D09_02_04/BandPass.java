package net.htwater.think.D09.D09_02_04;

/**
 * Created by 96955 on 2019/2/15.
 */
public class BandPass extends Filter {
    double lowcutoff;
    double higncutoff;

    public BandPass(double lowcutoff, double higncutoff) {
        this.lowcutoff = lowcutoff;
        this.higncutoff = higncutoff;
    }

    public WaveForm process(WaveForm input) {
        return input;
    }
}
