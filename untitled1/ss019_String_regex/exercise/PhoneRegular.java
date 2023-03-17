package ss019_String_regex.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneRegular {
    public PhoneRegular(){}
    private static final String s="^\\d{2}-0\\d{9}$";
 static Pattern pattern=Pattern.compile(s);
public static boolean Regex(String temp){
    Matcher matcher=pattern.matcher(temp);
    return matcher.matches();

}

    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);

        boolean check=false;
        String step="";
        while (!check){
            step= value.nextLine();
            boolean a=Regex(step);
            if (!a){
                System.out.println("nhap lai chuoi");
            }
            if (a) {
                check = true;
                System.out.println("chuoi hop le");
            }
        }
        if (check)
            System.out.println(step);
    }

}

