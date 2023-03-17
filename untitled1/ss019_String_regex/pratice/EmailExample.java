package ss019_String_regex.pratice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    Pattern pattern;
    Matcher matcher;
    private static final String email="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
   public EmailExample() {
       pattern = Pattern.compile(email);
   }
    public boolean isValid(String email){
        matcher=pattern.matcher(email);
       return matcher.matches();
    }

}
