package net.htwater.think.D10.D10_02;

/**
 * Created by 96955 on 2019/3/7.
 */
public class Parcel {

    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {

        private String label;

        public Destination(String label) {
            this.label = label;
        }

        String readLable() {
            System.out.println(label);
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        Contents contents = parcel.new Contents();
        Destination destination = parcel.new Destination("nb");
        destination.readLable();
    }
}
