package ss03_array_method_java;
import java.util.Scanner;

public class findMinElement {
    static Scanner value=new Scanner(System.in);
   static int size;
   static int arr[];

    public static void main(String[] args) {
        System.out.print("enter the size:");
        size=value.nextInt();
        arr=new int[size];
        System.out.println("enter the element of Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("the element"+i+":");
            arr[i]=value.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        int min=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (min>=arr[i]){
                min=arr[i];
            }


        }
        System.out.println("the smallest element in the array is:"+min);



    }
}
