package ss011_dsa_stack_queue.exercise;
import java.util.Scanner;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Stack;

public class ReverseArray {
    public static int[]Reverse(int arr[]){
        Stack<Integer>stack=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        int arr1[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=stack.pop();

        }
        return arr1;

    }

    public static void main(String[] args) {
        System.out.println("enter the size");
        Scanner value=new Scanner(System.in);
        int size=value.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=value.nextInt();

        }
        int reverse[]=Reverse(arr);
        System.out.println("the array before reverse");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("the array after reverse");
        for (int x:reverse)
        System.out.println(x);
    }
}