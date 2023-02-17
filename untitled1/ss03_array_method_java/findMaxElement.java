package ss03_array_method_java;
import java.util.Scanner;
public class findMaxElement {
   static Scanner value =new Scanner(System.in);
   public static void main(String[] args) {
       System.out.println("enter the rowspan");
       int row=value.nextInt();
       System.out.println("enter the colspan");
       int col=value.nextInt();
       int arr[][]=new int[row][col];
       System.out.print("enter the element arr");
       for (int i = 0; i <arr.length ; i++) {
           for (int j = 0; j < arr[i].length; j++) {
               arr[i][j]=value.nextInt();

           }

       }
       for (int i = 0; i <arr.length ; i++) {
           for (int j = 0; j < arr[i].length; j++) {
               System.out.print(arr[i][j]+"\t");
           }
           System.out.println("");

       }
       int total=0;
       int b=0;
       int a=0;

           total=arr[0][0];


       int max=0;
       for (int i = 0; i <arr.length ; i++) {
           for (int j = 1; j < arr[i].length; j++) {
               if (total<arr[i][j]){
                   max=arr[i][j];
                   a=i;
                   b=j;


               }



           }


           
       }
       System.out.println("the element max is:"+max+"the row at A:"+(a+1)+"the col at B:"+(b+1));

           
       }

    }

