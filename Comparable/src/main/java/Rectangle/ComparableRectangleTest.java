package Rectangle;
import java.util.Arrays;

public class ComparableRectangleTest {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = new ComparableRectangle[3];
        rectangles[0] = new ComparableRectangle(3.6, 5.0);
        rectangles[1] = new ComparableRectangle();
        rectangles[2] = new ComparableRectangle(3.5, 2.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableRectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        Arrays.sort(rectangles);

        System.out.println("After-sorted:");
        for (ComparableRectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}