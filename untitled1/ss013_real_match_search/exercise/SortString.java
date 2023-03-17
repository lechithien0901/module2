package ss013_real_match_search.exercise;

import ss016_java.io.exercise.TheCountry;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class SortString {

        public static void sortString(String arr) {
           char[] charArray=arr.toCharArray();
           int key;
           char value;
            for (int i = 0; i < charArray.length ; i++) {
key=i;
value=charArray[i];
while(key>0&&value<charArray[key-1]){
    charArray[key]=charArray[key-1];
    key--;
}
charArray[key]=value;

            }
            for (char x:charArray){
                System.out.println(x);
            }


            }

    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        String str=value.nextLine();
        System.out.println("array when unsorted");
        System.out.println(str);

        System.out.println("array when sorted");
 sortString(str);

        }
    }

