package ss017_binaryfile_serialization.pratice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args)  {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("D:\\Module02\\untitled1\\ss016_java\\io\\pratice\\numbers.txt"));
            Product product = new Product(1, "IPhone 12", 2800000, "New");
            oos.writeObject(product);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Success!");
    }
}
