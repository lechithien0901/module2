package ss014_real_match_sort.pratice;
import java.util.Scanner;
public class BubbleSortByStep {
    public static void main(String[] args) {
        System.out.println("Enter the length of size of array");
        Scanner value=new Scanner(System.in);
        int size=value.nextInt();
        int array[]=new int[size];

        for (int i = 0; i < array.length ; i++) {
            System.out.println("Enter the element : "+i);
            array[i]=value.nextInt();
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.println("the element tou trust entry is = "+array[i] +"\t");

        }
        bubbleSortByStep(array);
        for(int x:array){
            System.out.println(x);
        }

    }
    public static void bubbleSortByStep(int arr[]){
        boolean step=true;
        for (int i = 0; i < arr.length-1&&step; i++) {
            step=false;
            for (int j = arr.length-1; j >i ; j--) {
                if (arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                step=true;

            }

        }
    }
}
