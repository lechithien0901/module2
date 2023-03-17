package ss019_String_regex.pratice;

public class TestEmailExample {
   static EmailExample emailExample;
    private static final String[] valid=new String[]{"lechithien@gmail.com","Thienlcfs90921@gmail.com"};
    private static final String[] isValid=new String[]{"asdasd$","ádasdasda"};

    public static void main(String[] args) {
        emailExample=new EmailExample();
        for (String email:valid){
            Boolean step=emailExample.isValid(email);
            System.out.println(email+step);
        }
        for (String email:isValid){
            Boolean temp=emailExample.isValid(email);
            System.out.println(email+temp);
        }

    }
}
