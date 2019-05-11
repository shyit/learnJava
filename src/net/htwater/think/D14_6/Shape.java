package net.htwater.think.D14_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cambrian on 2019/5/9.
 */
public class Shape {
    public void draw(){
        System.out.println("Shape.draw()");
    }

    public static void main(String[] args){
        List<Shape> shapeList= Arrays.asList(new Circle(),new Square(),new Triangle());
        for (Shape shape:shapeList){
            shape.draw();
            try {
                Class c=Class.forName("Shape");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
class Circle extends Shape {
    static {
        System.out.println("Loading Circle");
    }
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
}

class Square extends Shape {
    static {
        System.out.println("Loading Square");
    }
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
}

class Triangle extends Shape {
    static {
        System.out.println("Loading Triangle");
    }
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
}

