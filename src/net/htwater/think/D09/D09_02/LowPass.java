package net.htwater.think.D09.D09_02;

/**
 * Created by 96955 on 2019/1/7.
 */
public class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff=cutoff;
    }

    public WaveForm process(WaveForm waveForm){
        return waveForm;
    }
}
