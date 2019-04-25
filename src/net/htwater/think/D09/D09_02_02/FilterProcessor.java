package net.htwater.think.D09.D09_02_02;

import net.htwater.think.D09.D09_02.BandPass;
import net.htwater.think.D09.D09_02.HighPass;
import net.htwater.think.D09.D09_02.LowPass;
import net.htwater.think.D09.D09_02.WaveForm;

/**
 * Created by 96955 on 2019/1/7.
 */
public class FilterProcessor {
    public static void main(String[] args){
        WaveForm waveForm=new WaveForm();
        Apply.process(new FilterAdapter(new LowPass(1.0)),waveForm);
        Apply.process(new FilterAdapter(new HighPass(2.0)),waveForm);
        Apply.process(new FilterAdapter(new BandPass(3.0,4.0)),waveForm);
    }

}
