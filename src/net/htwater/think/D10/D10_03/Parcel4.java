package net.htwater.think.D10.D10_03;

/**
 * Created by 96955 on 2019/3/8.
 */
public class Parcel4 {
    public Wrapping wrapping(int i) {
        return new Wrapping(i) {
            private int j=9221;

            @Override
            public int value() {
                return super.value() * 47+j;
            }
        };
    }

    public static void main(String[] args) {
        Parcel4 parcel4 = new Parcel4();
        Wrapping wrapping = parcel4.wrapping(2);
        System.out.println(wrapping.value());
    }
}
