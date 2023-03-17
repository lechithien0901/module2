package ss017_binaryfile_serialization.pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadByteConsole {
    public static void main(String[] args) throws IOException {


        InputStream is = new FileInputStream("D:\\Module02\\untitled1\\ss016_java\\io\\pratice\\numbers.txt");
int i=-1;
byte[]bytes=new byte[10];
while((i=is.read(bytes))!=-1){
    String s=new String(bytes,0,i);
    System.out.println(s);
}
is.close();
}
}