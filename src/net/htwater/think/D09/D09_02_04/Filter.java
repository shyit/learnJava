package net.htwater.think.D09.D09_02_04;

/**
 * Created by 96955 on 2019/2/15.
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public WaveForm process(WaveForm inoput){
        return inoput;
    }
}
