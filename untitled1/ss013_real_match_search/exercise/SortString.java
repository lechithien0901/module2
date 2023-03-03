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
//    File file = new File("D:\\Module02\\untitled1\\ss016_java\\io\\exercise\\csv");
//    List<TheCountry> countries;
//        countries = new ArrayList<>();
//
//        try (Scanner scanner = new Scanner(file)) {
//        while (scanner.hasNextLine()) {
//        String line = scanner.nextLine();
//        String[] fields = line.split(",");
//
//        int id = Integer.parseInt(fields[0]);
//        String code = fields[1];
//        String name = fields[2];
//
//        TheCountry country = new TheCountry(id, code, name);
//        countries.add(country);
//        }
//        } catch (FileNotFoundException e) {
//        System.err.println("Không tìm thấy file: " + e.getMessage());
//        }
//
//        for (TheCountry country : countries) {
//        System.out.println(country);
//        }
//        }



