package ss015_Exception_debug.pratice;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
 public Integer []creatArray(){
     Random rd=new Random();
     Integer arr[]=new Integer[100];
     for (int i = 0; i < 100; i++) {
         arr[i]=rd.nextInt(100);
         System.out.println(arr[i]);

     }
     return arr;
 }

    public static void main(String[] args) {
     Scanner value=new Scanner(System.in);
        ArrayExample arrayExample=new ArrayExample();
        Integer arr[]=arrayExample.creatArray();
        int x=value.nextInt();
        try{
            System.out.println(x+"and = "+arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("mảng đã vượt quá");
        }
    }
}
