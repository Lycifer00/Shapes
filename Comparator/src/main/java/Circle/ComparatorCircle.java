package Circle;
import java.util.Comparator;

public class CircleComparator implements Comparator<CircleComparator> {

    @Override
    public  int compare(Circle c1, Circle c2) {
        if (c1.() > c2.()) return 1;
        else if (c1.getArea() < c2.getArea()) return -1;
        else return 0;
    }
}

