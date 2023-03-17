package ss019_String_regex.pratice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AcountExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String accountRegex="^[_a-z0-9]{6,}$";
    public AcountExample(){
        pattern=Pattern.compile(accountRegex);
    }
    public boolean AccountIsValid(String step){
        matcher=pattern.matcher(step);
        return matcher.matches();

    }
}
