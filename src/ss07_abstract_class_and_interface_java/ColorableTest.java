package ss07_abstract_class_and_interface_java;
import ss06_inheritance.Circle;

import java.util.Scanner;
import  ss06_inheritance.Rectangle;
import  ss06_inheritance.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        Circle[] circles=new Circle[1];
        System.out.print("Enter the radius you want enter here :");
        double a=value.nextDouble();
       circles[0]=new Circle(a);
       for (Circle circle:circles){

            System.out.println("Area of Circle is :");
            System.out.println(circle.getArea());
            System.out.println("The HowtoColor of Circle is :");
            System.out.println(circle.howToColor());
            System.out.println(" Perimeter of Circle is :");
            System.out.println(circle.getPerimeter());
        }
        Rectangle[] rectangles=new Rectangle[1];
        System.out.print("enter the width anh the height :");
        double b=value.nextDouble();
        double c=value.nextDouble();

        rectangles[0]=new Rectangle(b,c);


        for (Rectangle rectangle:rectangles){
            System.out.println("The Perimeter of Rectangle is :");
            System.out.println(rectangle.getPerimeter());
            System.out.println("The area of Rectangle is :");
            System.out.println(rectangle.getArea());
            System.out.println("The HowtoColor of Rectangle is :");
            System.out.println(rectangle.howToColor());
        }
      Square[]squares=new Square[1];
        System.out.println("enter the side of Square :");
        double d=value.nextDouble();
        squares[0]=new Square(d);

        for (Square square:squares){
            System.out.println("The Perimeter of Square is:");
            System.out.println(square.getPerimeter());
            System.out.println("The Area of Square is :");
            System.out.println(square.getArea());
            System.out.println("The HowtoColor of Square is : ");
            System.out.println(square.howToColor());
        }






    }
}
