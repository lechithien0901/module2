package demo1;
import java.util.Scanner;

import java.util.LinkedList;
import java.util.Queue;
public class Palindrome {

    public static boolean Palindrome(String str) {
        str=str.replaceAll("\\s+","");
        Queue<Character> queue = new LinkedList<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            queue.add(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != queue.remove()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("enter the String you want try  Palindrome");
        String a= value.nextLine();
        boolean b= Palindrome(a);
        System.out.println(b);
    }
}