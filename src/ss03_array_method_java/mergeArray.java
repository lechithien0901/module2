package ss03_array_method_java;
import java.util.Scanner;
public class mergeArray {
     static int size;
   static int array[];
   static int sizes;
   static int arrays[];
   static Scanner value=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter the size of array A:");
        size=value.nextInt();
        array=new int[size];
        System.out.println("enter the element of array A");
        for (int i = 0; i <array.length ; i++) {
            array[i]=value.nextInt();

        }
        System.out.println("enter the size of array B");
        sizes=value.nextInt();
        arrays=new int[sizes];
        System.out.println("enter the size of element B");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i]=value.nextInt();

        }
        System.out.println("Array A");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+"\t");

        }
        System.out.println("");
        System.out.println("Array B");
        for (int i = 0; i <arrays.length ; i++) {
            System.out.print(arrays[i]+"\t");

        }
        System.out.println("");
        System.out.println("The Array C");
        int newArray[]=new int[sizes+size];
        for (int i = 0; i <array.length ; i++) {
            newArray[i]=array[i];

        }
        for (int i = 0; i <arrays.length ; i++) {
            newArray[array.length+i]=arrays[i];

        }
        for(int b:newArray){
            System.out.print(b+"\t");
        }



    }

}
