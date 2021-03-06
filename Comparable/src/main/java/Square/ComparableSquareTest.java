package Square;
import java.util.Arrays;

public class ComparableSquareTest {
    public static void main(String[] args) {
        ComparableSquare[] squares = new ComparableSquare[3];
        squares[0] = new ComparableSquare(3.6);
        squares[1] = new ComparableSquare();
        squares[2] = new ComparableSquare(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableSquare square : squares) {
            System.out.println(square);
        }

        Arrays.sort(squares);

        System.out.println("After-sorted:");
        for (ComparableSquare square : squares) {
            System.out.println(square);
        }
    }
}
