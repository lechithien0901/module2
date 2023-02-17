package ss03_array_method_java;
import java.util.Scanner;
public class addArray {
    public static void main(String[] args) {
 Scanner value=new Scanner(System.in);
 int size;
 int array[];
        System.out.print("enter the size");
        size=value.nextInt();
        array=new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter the element "+i);
            array[i]=value.nextInt();

        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+"\t");

        }

        System.out.println("enter the element X");
        int x=value.nextInt();
        System.out.print("enter the index");
        int index=value.nextInt();
        int newArr[]=new int [size+1];

        for (int i = 0; i <=array.length ; i++) {
            if(i<index){
                newArr[i]=array[i];
            }
            else if(i==index){
                newArr[i]=x;
            }
            else {
                newArr[i]=array[i-1 ];
            }

        }
       for(int b:newArr){
           System.out.println(b);
       }





    }


}
