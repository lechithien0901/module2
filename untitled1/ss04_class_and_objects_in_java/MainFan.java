package ss04_class_and_objects_in_java;
import java.util.Scanner;
public class MainFan  {
    static Scanner value=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("enter the speed");
        int a=value.nextInt();

        Fan fan1=new Fan();
       fan1.turnOn();
        fan1.setSpeed(a);
        fan1.getTotal();
        fan1.setRadius(10);
        fan1.setColor("Yellow");


Fan fan2=new Fan();
        System.out.println("enter the speed 2");
int b=value.nextInt();
fan2.turnOn();
fan2.setSpeed(b);
fan2.getTotal();
fan2.getRadius();
fan2.setColor("red");
fan2.turnOff();
        System.out.println(fan1);
        System.out.println(fan2);

    }
}
