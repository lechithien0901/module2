package ss011_dsa_stack_queue.exercise;

import java.util.Stack;
import java.util.Scanner;

public class ReverseString {
    public static String Reverse(String x) {
        Stack<Character> wStack = new Stack<>();
        for (int i = 0; i <x.length() ; i++) {
            wStack.push(x.charAt(i));
        }
        String mWorld="";
        for (int i = 0; i <x.length(); i++) {
            mWorld+=wStack.pop();

        }
        return mWorld;
    }

    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("Enter the String you want to reserve");
        String a=value.nextLine();
        System.out.println("The String before reverse");
        System.out.println(a);
        System.out.println("The String after reverse");
        System.out.println(Reverse(a));


    }
    }