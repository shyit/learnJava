package net.htwater.think.P.P158;

/**
 * Created by 96955 on 2019/1/9.
 */
public class Sandwich extends ProtableLunch {
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();

    Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }

}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal{
    Lunch() {
        System.out.println("Lunch()");
    }
}

class ProtableLunch extends Lunch {
    ProtableLunch() {
        System.out.println("ProtableLunch()");
    }
}

