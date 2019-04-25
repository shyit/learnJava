package net.htwater.think.D10.D10_03;

/**
 * Created by 96955 on 2019/3/8.
 */
public class Parcel {
    public Destination destination(String s) {

        if (true){
            class PDestination implements Destination {
                private String label;

                public PDestination(String label) {
                    this.label = label;
                }

                @Override
                public String label() {
                    return label;
                }
            }

            PDestination pDestination=new PDestination("dajiahe");
        }



        return null;
    }

    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        Destination destination = parcel.destination("");
    }
}
