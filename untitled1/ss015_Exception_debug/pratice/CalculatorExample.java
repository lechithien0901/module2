package ss015_Exception_debug.pratice;

import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("enter the x :");
        int x=value.nextInt();
        System.out.println("Enter the y :");
        int y=value.nextInt();
        calculation(x,y);
    }
    private static void calculation(int x,int y) {

        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("\n" +
                    " plus = " + a);
            System.out.println("subtraction = " + b);
            System.out.println("\n" +
                    "multiplication = " + c);
            System.out.println("division = " + d);
        }catch (Exception e){
            System.out.println("xay ra ngoại lệ"+e.getMessage());
        }finally {
            System.out.println("có lỗi hay không có lỗi tôi cũng chạy");
        }
        System.out.println("end program");
    }
}
