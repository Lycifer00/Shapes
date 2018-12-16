package Shape;

import Colorable.Colorable;

public class Square extends Shape implements Colorable {
    private double side = 1.0;

    @Override
    public String howToColor() {
        return "Color all four sides!";
    }

    public Square() {
    }

    Square(double side) {
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

