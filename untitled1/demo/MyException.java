package demo;

public class MyException extends Exception{
  private String e;
    public MyException(String e){
        super(e);
        this.e=e;
    }
    @Override
    public String getMessage(){
        return this.e;
    }
}
