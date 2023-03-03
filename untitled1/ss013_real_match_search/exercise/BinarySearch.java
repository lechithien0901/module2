package ss013_real_match_search.exercise;

import java.util.Scanner;

public class BinarySearch {
    public int BinarySearch(int arr[],int left,int right,int value){
        while(right>=left){
            int mid=(left+right)/2;
            if (arr[mid]>value)
                return BinarySearch(arr,left,mid-1,value);
            else if (arr[mid]<value)
                return BinarySearch(arr,mid+1,right,value);
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entry the size :");
        int size= scanner.nextInt();
        int arr[]=new int[size];
        System.out.println("input array and arrays element sorted by length");
        int left=0;
        int right= arr.length-1;
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=scanner.nextInt();

        }
        BinarySearch binarySearch=new BinarySearch();
        System.out.println("Entry the value you need to find");
        int value=scanner.nextInt();
       int step= binarySearch.BinarySearch(arr,left,right,value);
        if (step==-1){
            System.out.println("the value you suggested was not found in the array");
        }
        else{
            System.out.println("element found at position at ="+step);
        }
    }
}
