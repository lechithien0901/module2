package ss011_dsa_stack_queue.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static boolean Palindrome(String list){
        list=list.replaceAll("\\s+","");
        Queue<Character> queue=new LinkedList<>();
        for (int i = list.length()-1; i>=0 ; i--) {
            queue.add(list.charAt(i));


        }
        for (int i = 0; i < list.length(); i++) {
            if (list.charAt(i)!=queue.remove()){
            return false;

        }
    }
        return true;

}

    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("entryy the list you want entry");
        String list=value.nextLine();
        boolean tf=Palindrome(list);
        System.out.println(tf);
    }}