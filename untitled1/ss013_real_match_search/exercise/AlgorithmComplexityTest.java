package ss013_real_match_search.exercise;

import java.util.Scanner;

    public class AlgorithmComplexityTest {
        public static void main(String[] args) {
            Scanner value=new Scanner(System.in);
            System.out.println("Entry the String ");
          String str=value.nextLine();
          int arr[]=new int [255];
            for (int i = 0; i <str.length() ; i++) {
                int step=(int) str.charAt(i);
                arr[step]++;

            }
          int max=0;
            char temp=(char) 1;
            for (int i = 0; i <255 ; i++) {
                if (arr[i]>max){
                    max=arr[i];
                    temp=(char)i;
                }

            }
            System.out.println("the most appearing character = "+temp+ " and the most appearances " + max);

        }

}
