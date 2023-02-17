package ss06_inheritance;
import java.util.Scanner;
public class TextCylinder {
    static Scanner value=new Scanner(System.in);

    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
//        cylinder=new Cylinder(7.0,15.0,"red");
//        cylinder.setRadius(8);
        System.out.println("enter the height : ");
        double height=value.nextDouble();
        System.out.println( "enter the radius : ");
        double radius=value.nextDouble();
        System.out.println( "enter the color of Shape : ");
        String color=value.next();
        cylinder=new Cylinder(height,radius,color);
        System.out.println(cylinder);
    }
}
