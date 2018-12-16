package Square;

public class ComparableSquare extends Square
        implements Comparable<ComparableSquare> {

    ComparableSquare() {
    }

    ComparableSquare(double side) {
        super(side);
    }

    ComparableSquare(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    @Override
    public int compareTo(ComparableSquare o) {
        if (getArea() > o.getArea()) return 1;
        else if (getArea() < o.getArea()) return -1;
        else return 1;
    }
}
