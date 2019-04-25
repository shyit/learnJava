package net.htwater.think.D09.D09_02;

/**
 * Created by 96955 on 2019/1/7.
 */
public class BandPass extends Filter {
    double lowCutoff;
    double highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    public WaveForm process(WaveForm waveForm) {
        return waveForm;
    }
}