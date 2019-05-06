package net.htwater.think.D13_2;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Created by cambrian on 2019/5/7.
 */
public class Turtle {
    private String name;
    private Formatter formatter;

    public Turtle(String name, Formatter formatter) {
        this.name = name;
        this.formatter = formatter;
    }

    public void move(int x, int y) {
        formatter.format("%s The Turtle is at(%d,%d)\n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream outalias = System.out;
        Turtle tommy = new Turtle("Tommy", new Formatter(outalias));
        Turtle terry = new Turtle("terry", new Formatter(outalias));
        tommy.move(0, 0);
        terry.move(4, 8);
        tommy.move(3, 4);
        terry.move(2, 5);
        tommy.move(3, 3);
        terry.move(3, 3);
    }
}
