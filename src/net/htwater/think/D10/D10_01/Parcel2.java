package net.htwater.think.D10.D10_01;

/**
 * Created by 96955 on 2019/2/27.
 */
public class Parcel2 {

    public static void main(String[] args) {
        Parcel2 parcel1 = new Parcel2();
        parcel1.ship("Tasmania");

        Parcel2 p2 = new Parcel2();
        Contents contents = p2.contents();
        p2.to("Borneo");
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

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents contents = new Contents();
        Destination destination = new Destination(dest);
        System.out.println(destination.Label);
    }
}
