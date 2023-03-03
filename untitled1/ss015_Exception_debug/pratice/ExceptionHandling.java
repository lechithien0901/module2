package ss015_Exception_debug.pratice;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionHandling {

    public static int inputNumber()throws InputMismatchException{
        Scanner value=new Scanner(System.in);

        System.out.println("enter the number");
        try {
            int a = value.nextInt();
            return a;
        }catch (Exception e){
            System.out.println("bạn pải nhập kí tự đúng của nó");
        }

return 0;
    }

    public static void main(String[] args) {
       int b=inputNumber();
        System.out.println(b);
    }
}
