package ss03_array_method_java;
import java.util.Scanner;
public class deleteArray {
   static int array[];
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int size;

        System.out.println("enter the size");
        size=value.nextInt();
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("enter element:"+(i+1));
            array[i]=value.nextInt();
            i++;
        }
        System.out.println("the list you just entered is");
        for (int j = 0; j <array.length ; j++) {

            System.out.println(array[j]);

        }
        System.out.println("enter the index you will remove");
        int index=value.nextInt();
int a=0;
       while(a<array.length){
           if (a==index){
               while(a<array.length-1){
                   array[a]=array[a+1];
                   a++;
               }
               array[array.length-1]=0;
               break;
           }else
           a++;
       }
       for (int b:array){
           System.out.println(b+"\t");
       }
    }

}
