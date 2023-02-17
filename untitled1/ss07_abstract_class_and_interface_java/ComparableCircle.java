package ss07_abstract_class_and_interface_java;
import ss06_inheritance.Circle;
public class ComparableCircle extends Circle
        implements Comparable {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle radius) {
        if (getRadius() > radius.getRadius()) return 1;
        else if (getRadius() < radius.getRadius()) return -1;
        else return 1;
    }
}