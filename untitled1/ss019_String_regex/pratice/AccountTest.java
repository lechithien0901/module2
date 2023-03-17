package ss019_String_regex.pratice;

public class AccountTest {
    private static final String []account1=new String[]{"abcdef_","sdfasdf_123"};
    private static final String []account2=new String[]{"abcf_","_123"};
  static AcountExample acountExample;

    public static void main(String[] args) {
        acountExample=new AcountExample();
        for (String account:account1){
            boolean step=acountExample.AccountIsValid(account);
            System.out.println(account+" = "+step);


        }
        for (String step:account2){
            boolean temp=acountExample.AccountIsValid(step);
            System.out.println(step+" = "+temp);
        }
    }
}
