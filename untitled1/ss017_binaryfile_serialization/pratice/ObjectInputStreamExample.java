package ss017_binaryfile_serialization.pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String args[]) throws Exception {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("product.txt"));
            Product product = (Product) ois.readObject();
            System.out.println(product);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
//D:\\Module02\\untitled1\\ss016_java\\io\\pratice\\numbers.txt
//        D:\\Module02\\untitled1\\ss017_binaryfile_serialization\\pratice\\file
