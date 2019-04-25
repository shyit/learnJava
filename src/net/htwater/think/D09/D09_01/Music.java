package net.htwater.think.D09.D09_01;

/**
 * Created by 96955 on 2019/1/26.
 */
public class Music {
    public static void tune(Instrument instrument){
        instrument.play(Note.B_FLAT);
    }

    public static void tuneall(Instrument[] instruments){
        for (Instrument instrument : instruments){
            tune(instrument);
        }
    }

    public static void main(String[] args){
        Instrument[] instruments={
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Bress(),
                new Woodwind(),
        };

        tuneall(instruments);
    }
}

enum Note {
    MIDDLE_C,
    V_SHARP,
    B_FLAT,
}

class Instrument {
    void play(Note note) {
        System.out.println("Instrument.play()");
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    void play(Note note) {
        System.out.println("Wind.play()");
    }

    String what() {
        return "Wind";
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }
}


class Stringed extends Instrument {
    void play(Note note) {
        System.out.println("Stringed.play()");
    }

    String what() {
        return "Stringed";
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Percussion extends Instrument {
    void play(Note note) {
        System.out.println("Percussion.play()");
    }

    String what() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Bress extends Instrument {
    void play(Note note) {
        System.out.println("Bress.play()");
    }

    String what() {
        return "Bress";
    }

    void adjust() {
        System.out.println("Adjusting Bress");
    }
}

class Woodwind extends Instrument {
    void play(Note note) {
        System.out.println("Woodwind.play()");
    }

    String what() {
        return "Woodwind";
    }

    void adjust() {
        System.out.println("Adjusting Woodwind");
    }
}

