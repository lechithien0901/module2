package ss07_abstract_class_and_interface_java.resizeable;
import ss07_abstract_class_and_interface_java.Circle;
import ss07_abstract_class_and_interface_java.Rectangle;
import ss07_abstract_class_and_interface_java.Square;

import java.util.Scanner;
public class ResizeableTest {
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);
        Circle[] circles=new Circle[1];
        circles[0]=new Circle(3.6);
        for (Circle circle:circles){
            System.out.println(circle);
            System.out.print("\n" +
                    "Enter the number you want to increase the circle size here");

            double a=value.nextDouble();
            System.out.println(circle.resize(a));
        }
        Rectangle[]rectangles=new Rectangle[1];
        rectangles[0]=new Rectangle();
        for (Rectangle rectangle:rectangles){
            System.out.println(rectangle);
            System.out.println("Enter the number you want to increase the circle size here");

            double b=value.nextDouble();


            System.out.println(rectangle.resize(b));
        }
        Square[]squares=new Square[1];
        squares[0]=new Square();
        for(Square square:squares){
            System.out.println(square);
            System.out.println("Enter the number you want to increase the Square size here");
            double c=value.nextDouble();

            System.out.println(square.resize(c));
        }
        }
    }

