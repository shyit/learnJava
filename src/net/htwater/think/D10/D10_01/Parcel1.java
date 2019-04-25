package net.htwater.think.D10.D10_01;

/**
 * Created by 96955 on 2019/2/27.
 */
public class Parcel1 {

    public static void main(String[] args) {
        Parcel1 parcel1 = new Parcel1();
        parcel1.ship("hello nice");
    }


    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String Label;

        public Destination(String label) {
            Label = label;
        }

        public String getLabel() {
            return Label;
        }
    }

    public void ship(String dest) {
        Contents contents = new Contents();
        Destination destination = new Destination(dest);
        System.out.println(destination.Label);
    }

}
