package net.htwater.think.D10.D10_04;

/**
 * Created by 96955 on 2019/3/13.
 */
public class Parcel {

    private static class ParcelContrents implements Contents{

        private int i=11;

        @Override
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination{

        private String Label;

        public ParcelDestination(String label) {
            Label = label;
        }

        @Override
        public String readLabel() {
            return Label;
        }

        public static void f(){

        }

        static int x=10;

        static class AnotherLevel{
            public static void f(){

            }

            static int x=0;
        }
    }

    public static Destination destination(String s){
        return new ParcelDestination(s);
    }

    public static Contents contents(){
        return new ParcelContrents();
    }

    public static void main(String[] args){
        Contents contents=contents();
        Destination destination=destination("tasmania");
    }
}
