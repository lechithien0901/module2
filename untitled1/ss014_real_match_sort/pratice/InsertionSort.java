package ss014_real_match_sort.pratice;

public class InsertionSort {
    public static void InsertionSort(int arr[]){
        int key, value;
        for (int i = 1; i <arr.length ; i++) {
            value=arr[i];
            key=i;
            while(key>0&&value<arr[key-1]){
                arr[key]=arr[key-1];
                key--;
            }
            arr[key]=value;
        }

        }

    public static void main(String[] args) {
        int array[]={9,7,5,8,3,4,2,1};
        InsertionSort(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);

        }
    }
}
