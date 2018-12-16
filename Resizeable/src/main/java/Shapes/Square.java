package Shapes;

import Resizeable.Resizeable;

public class Square extends Shape implements Resizeable {
    private double side = 1.0;

    @Override
    public void resize(double percent) {
        this.side *= percent/100;
    }

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super (color, filled);
        this.side = side;
    }

    private double getSide() {
        return side;
    }

    private void setSide(double side) {
        this.side = side;
    }
    private double getArea(){
        return side * side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + " and area is: "
                +getArea()
                + ", which is a subclass of "
                + super.toString();
    }
}

