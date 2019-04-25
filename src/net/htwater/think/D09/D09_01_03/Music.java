package net.htwater.think.D09.D09_01_03;

/**
 * Created by 96955 on 2019/1/26.
 */
public class Music {
    public static void tune(Instrument instrument) {
        instrument.play(Note.B_FLAT);
    }

    public static void tuneall(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        Instrument[] instruments = {
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

interface Instrument {
    void play(Note note);

    String what();

    void adjust();
}

class Wind implements Instrument {
    public void play(Note note) {
        System.out.println("Wind.play2()");
    }

    public String what() {
        return "Wind";
    }

    public void adjust() {
        System.out.println("Adjusting Wind");
    }
}


class Stringed implements Instrument {
    public void play(Note note) {
        System.out.println("Stringed.play()2");
    }

    public String what() {
        return "Stringed";
    }

    public void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Percussion implements Instrument {
    public void play(Note note) {
        System.out.println("Percussion.play()2");
    }

    public String what() {
        return "Percussion";
    }

    public void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Bress implements Instrument {
    public void play(Note note) {
        System.out.println("Bress.play()2");
    }

    public String what() {
        return "Bress";
    }

    public void adjust() {
        System.out.println("Adjusting Bress");
    }
}

class Woodwind implements Instrument {
    public void play(Note note) {
        System.out.println("Woodwind.play()2");
    }

    public String what() {
        return "Woodwind";
    }

    public void adjust() {
        System.out.println("Adjusting Woodwind");
    }
}

