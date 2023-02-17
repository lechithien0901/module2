package ss03_array_method_java;
import java.util.Scanner;
public class CharInString {
    static String myString = "Hello World";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 character:");
        char c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (c == myString.charAt(i)) {
                count++;
            }
        }
        System.out.println(c + " appears " + count + " times in String");
    }
}
