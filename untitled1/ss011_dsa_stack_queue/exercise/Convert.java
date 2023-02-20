package ss011_dsa_stack_queue.exercise;
import java.util.Scanner;

import java.util.Stack;

public class Convert {
    public static String ChangeBinary(int num){
        if (num==0){
            return "0";
        }
        Stack<Integer>stack=new Stack<>();

        while (num>0){
       int    binary=num%2;
            stack.push(binary);
            num/=2;
        }
        StringBuilder connect=new StringBuilder();
        while (!stack.isEmpty()){
            connect.append(stack.pop());


        }
        return connect.toString();

}

    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("Enter the number you want to entry");
        int num=value.nextInt();
      String result=ChangeBinary(num);
        System.out.println(result);

    }}
