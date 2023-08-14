package ss04_class_and_objects_in_java;
import java.lang.Math;

public class QuadraticEquation {
   double a;
      double b;
    double c;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public  double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public  double getRoot1() {
        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public  double getRoot2() {
        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

    }
}
