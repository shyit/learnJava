package net.htwater.think.D12_03;

/**
 * Created by 96955 on 2019/4/30.
 */
public class Switch {

    private boolean state=false;

    public boolean read(){
        return state;
    }

    public void on(){
        state=true;
        System.out.println(this);
    }

    public void off(){
        state=false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return state?"On":"Off";
    }

}
