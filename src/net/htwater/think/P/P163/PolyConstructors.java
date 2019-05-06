package net.htwater.think.P.P163;

/**
 * Created by 96955 on 2019/1/12.
 */
public class PolyConstructors {
    public static void main(String[] args){
        new RoundGlyph(5);
    }
}

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before draw");
        draw();
        System.out.println("Glyph() after draw");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius=" + radius);
    }

    RoundGlyph(int r){
        radius=r;
        System.out.println("RoundGlyph.RoundGlyph(), radius=" + radius);
    }
}
