package Rectangle;

public class ComparableRectangle extends Rectangle
        implements Comparable<ComparableRectangle> {

    ComparableRectangle() {
    }

    ComparableRectangle(double width, double length) {
        super(width, length);
    }

    ComparableRectangle(double width, double length, String color, boolean filled) {
        super(width, length , color, filled);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        if (getArea() > o.getArea()) return 1;
        else if (getArea() < o.getArea()) return -1;
        else return 1;
    }
}

