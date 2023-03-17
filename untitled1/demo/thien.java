package demo;

import java.util.Scanner;

public class thien{
    public static void main(String[] args)throws MyException {
        Scanner value=new Scanner(System.in);

        int a=value.nextInt();
        int b=value.nextInt();
        if (a==9| b==9){
            throw new MyException("bạn phải nhập số khác số 9");
        }
        if (a==3|b==3){
            throw new MyException("bạn phải nhập số khác 3");
        }

    }
}
