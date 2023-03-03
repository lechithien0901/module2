package ss014_real_match_sort.pratice;

public class BubbleSort1 {
    public static void BubbleSort1(int arr[]){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = arr.length-1; j >i  ; j--) {
                if (arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }

            }

        }

    }

    public static void main(String[] args) {
        System.out.println("the array is : ");
        int arr[]={9,7,5,6,4,3,1,2};
        BubbleSort1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
