package net.htwater.think.D09.D09_02_05;

import net.htwater.think.D09.D09_02_04.BandPass;
import net.htwater.think.D09.D09_02_04.HeighPass;
import net.htwater.think.D09.D09_02_04.LowPass;
import net.htwater.think.D09.D09_02_04.WaveForm;

/**
 * Created by 96955 on 2019/2/15.
 */
public class FilterProcessor {
    public static void main(String[] args) {
        WaveForm waveForm = new WaveForm();
        Apply.process(new FilterAdapter(new LowPass(1.0)), waveForm);
        Apply.process(new FilterAdapter(new HeighPass(2.0)), waveForm);
        Apply.process(new FilterAdapter(new BandPass(3.0, 5.0)), waveForm);

    }
}
