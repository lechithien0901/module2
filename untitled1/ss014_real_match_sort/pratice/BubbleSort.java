package ss014_real_match_sort.pratice;

public class BubbleSort {
    public static void bubbleSort(int array[]){
        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = array.length-1; j >i ; j--) {
                if (array[j]<array[j-1]) {
                    int tempt = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tempt;
                }
            }

        }

    }

    public static void main(String[] args) {
        int array[]={9,5,4,6,7,1,2};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
