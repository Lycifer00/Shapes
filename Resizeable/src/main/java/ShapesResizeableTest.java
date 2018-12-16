import Resizeable.Resizeable;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Square;

public class ShapesResizeableTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8.8,9.0);
        System.out.println(rectangle);
        ((Resizeable) rectangle).resize(140);
        System.out.println(rectangle);
        System.out.println("*****************");

        Circle circle = new Circle(4.8);
        System.out.println(circle);
        ((Resizeable) circle).resize(250);
        System.out.println(circle);
        System.out.println("*****************");

        Square square = new Square(5);
        System.out.println(square);
        ((Resizeable) square).resize(60);
        System.out.println(square);
    }
}
