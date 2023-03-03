package ss015_Exception_debug.pratice;

public class Triangle {
    int a,b,c;
    public Triangle(int a,int b,int c) throws IllegakTriangleException {

        if (a<0 | b<0 | c<0 ){
            throw new IllegakTriangleException("you entry wrong");
        }
        if(a+b<c|a+c<b|b+c<a){
            throw new IllegakTriangleException("this is noi Triangle");
        }
    }
}
