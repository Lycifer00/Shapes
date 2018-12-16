package Rectangle;
import Shape.Shape;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    Rectangle() {
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    private double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + " has area is="
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }
}
