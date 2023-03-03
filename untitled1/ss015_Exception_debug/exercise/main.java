package ss015_Exception_debug.exercise;





import java.util.Scanner;

public class main  {
    public static void main(String[] args)throws  IllegalTriangleException {
        System.out.println("Please enter the length of side a");
        Scanner value=new Scanner(System.in);
        double a=value.nextInt();
        System.out.println("Please enter the length of side b");
        double b=value.nextInt();
        System.out.println("Please enter the length of side c");
        double c=value.nextInt();
    Triangle triangle = new Triangle(a,b,c) ;
    }
}
