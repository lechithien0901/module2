package ss014_real_match_sort.pratice;
import java.util.Scanner;

public class SelectionSortpratice {
    public static void SelectionSortpratice(int []arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int value=arr[i];
            int key=i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[key]>arr[j]){
                    value=arr[j];
                    key=j;
                }
            }
            if (key!=i){
                arr[key]=arr[i];
                arr[i]=value;

            }

        }

    }

    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=value.nextInt();
        int array[]=new int[size];
        for (int i = 0; i <array.length ; i++) {
            array[i]=value.nextInt();
        }

        SelectionSortpratice(array);
        for(int x: array){
            System.out.println(x);
        }
    }
}
