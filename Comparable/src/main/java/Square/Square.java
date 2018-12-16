package Square;

import Shape.Shape;

public class Square extends Shape {
    private double side = 1.0;
    Square() {
    }

    Square(double side) {
        this.side = side;
    }

    Square(double side, String color, boolean filled) {
        super( color, filled);
        this.side = side;
    }

    private double getSide() {
        return side;
    }

    private void setSide(double side) {
        this.side = side;
    }


    public double getArea() {
        return side * side;
    }


    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                +" and area is: "
                +getArea()
                + ", which is a subclass of "
                + super.toString();
    }
}
