package ss05_access_modifier_static_method_in_java.com;

public class TestCircle {
    public static void main(String[] args) {
        Circle value=new Circle(5,"yellow");
        System.out.println(value.getArea());
        System.out.println(value.getRadius());
    }
}
