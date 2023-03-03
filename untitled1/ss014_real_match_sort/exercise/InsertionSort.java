package ss014_real_match_sort.exercise;
import java.util.Scanner;

public class InsertionSort {
    public static void InsertionSort(int arr[]){
    int key;
    int value;
        for (int i = 1; i < arr.length ; i++) {
            key=i;
            value=arr[i];
            while(key>0&&value<arr[key-1]){
                arr[key]=arr[key-1];
                key--;
            }
            arr[key]=value;
            System.out.println("array sort is : "+i+" ");
            System.out.println(" ");

            for(int x: arr){

                System.out.println(x+" ");
            }

        }
    }

    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("the arr \n" +
                "unsorted array");
        int arr[]={1,9,7,5,7,3};
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        InsertionSort(arr);

    }
}
