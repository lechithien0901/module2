package ss014_real_match_sort.pratice;

public class SelectionSort {
    public static void SelectionSort(int array[]){
        int key;
        for (int i = 0; i < array.length-1 ; i++) {
             key=i  ;
            for (int j = i+1; j < array.length ; j++) {
            if (array[j]<array[key]){
              key=j;
            }
           if (key!=i){
            int temp=array[key];
            array[key]=array[i];
            array[  i]=temp;


}

            }


        }
    }

    public static void main(String[] args) {
        int array[]={8,5,3,9,6,1,0,5,2};
        SelectionSort(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
