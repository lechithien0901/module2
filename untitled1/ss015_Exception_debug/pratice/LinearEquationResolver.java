package ss015_Exception_debug.pratice;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a*x+b=0',please");
        Scanner value=new Scanner(System.in);
        System.out.println("a : ");
        double a=value.nextDouble();
        System.out.println("b :");
        double b=value.nextDouble();
        if (a!=0){
            double x=-b/a;
            System.out.println(x);
        }
    }
}
