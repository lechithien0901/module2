package ss014_real_match_sort.exercise;

public class exampleInsertionSort {
    public static void exampleInsertionSort(int arr[]){
        for (int i = 1; i < arr.length ; i++) {
            int key=i;
            int step=arr[i];
            while(key>0&&step<arr[key-1]){
                arr[key]=arr[key-1];
                key--;
            }
            arr[key]=step;
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,5,3,8,4};
        exampleInsertionSort(a);
        for(int x:a){
            System.out.println(x);
        }
    }
    
}
