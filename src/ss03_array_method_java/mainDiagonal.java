package ss03_array_method_java;
import java.util.Scanner;
public class mainDiagonal {
    static Scanner value=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the row");
        int row=value.nextInt();
        System.out.println("enter the col");
        int col=value.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter the element of Array");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println("the element the row:"+(i+1)+"the col :"+(j+1)+":");

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
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (i==j){
                    total+=arr[i][j];
                }

            }

        }
        System.out.println("the sum of the main diagonals in the matrix is :"+total);

    }
}
