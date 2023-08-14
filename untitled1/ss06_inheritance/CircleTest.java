package ss06_inheritance;
public class CircleTest {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        circle=new Circle(15,"blue",true);
        System.out.println(circle);
    }
}