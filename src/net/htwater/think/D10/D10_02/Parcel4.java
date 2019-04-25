package net.htwater.think.D10.D10_02;

/**
 * Created by 96955 on 2019/3/7.
 */
public class Parcel4 {
    private class PContents implements Contents {

        int i = 90;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDesttination implements Destination {

        private String label;

        private PDesttination(String label) {
            this.label = label;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Contents contents() {
        return new PContents();
    }

    public Destination destination(String label) {
        System.out.println(label);
        return new PDesttination(label);
    }

}

class TestParcel {
    public static void main(String[] args) {
        Parcel4 parcel4 = new Parcel4();
        Contents contents = parcel4.contents();
        Destination destination= parcel4.destination("nignhai");
    }
}