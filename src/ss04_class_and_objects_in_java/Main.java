package ss04_class_and_objects_in_java;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    static Scanner value=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the a");
        double a=value.nextDouble();
        System.out.println("Enter the b");
        double b=value.nextDouble();
        System.out.println("Enter the c");
        double c=value.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println(quadraticEquation.getRoot1()+"and"+quadraticEquation.getRoot2());
        }
        else if (quadraticEquation.getDiscriminant()==0){
            System.out.println(quadraticEquation.getRoot1());
        }
        else {
            System.out.println("The equation has no roots");
        }

    }


        }


