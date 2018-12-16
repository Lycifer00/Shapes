import Shape.Shape;
import Shape.Circle;
import Shape.Rectangle;
import Shape.Square;
import Colorable.Colorable;


public class ShapeColorableTest {
    public static void main(String[] args){
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4.5);
        shapes[1] = new Rectangle();
        shapes[2] = new Square(2.1,"red",false);
        for (Shape shape : shapes) {
            if (shape instanceof Square){
                Colorable colorable = (Square) shape;
                System.out.println(colorable.howToColor());
            }

        }
    }
}
