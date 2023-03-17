package ss017_binaryfile_serialization.pratice;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args)throws IOException {


    OutputStream step=new FileOutputStream("D:\\Module02\\untitled1\\ss016_java\\io\\pratice\\numbers.txt");
byte bytes[]=new byte[]{'T','H','I','E','N'};
        for (int i = 0; i < bytes.length; i++) {
byte a=bytes[i];
step.write(a);
        }
        step.close();
}
}
