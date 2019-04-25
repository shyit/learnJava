package net.htwater.think.D10.D10_03;

/**
 * Created by 96955 on 2019/3/8.
 */
public class Parcel2 {
    public Contents contents() {
        return new Contents() {
            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel2 parcel2=new Parcel2();
        Contents contents= parcel2.contents();
        System.out.println(contents.value());
    }
}
