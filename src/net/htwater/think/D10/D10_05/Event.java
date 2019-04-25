package net.htwater.think.D10.D10_05;

/**
 * Created by 96955 on 2019/3/14.
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime){
        this.delayTime=delayTime;
        start();
    }

    public void start(){
        eventTime=System.nanoTime()+delayTime;

    }

    public boolean ready(){
        return System.nanoTime()>=eventTime;
    }



}
