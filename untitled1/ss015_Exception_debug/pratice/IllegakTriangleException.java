package ss015_Exception_debug.pratice;

public class IllegakTriangleException extends Exception{
    private String message;
    public  IllegakTriangleException(String message){
        super(message);

        this.message=message;
    }
    @Override
    public String getMessage(){
        return message;
    }

}
