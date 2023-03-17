package ss017_binaryfile_serialization.pratice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.io.IOException;


public class BulkCopy {
    private static void Copyfile(File source,File dest)throws IOException {
        OutputStream os=null;
        InputStream is=null;
        try{
            is=new FileInputStream(source);
                    os=new FileOutputStream(dest);
            byte bytes[]=new byte[1024];
            int i=0;

                while ((i=is.read(bytes))>0){
                    os.write(bytes,0,i);
                }




        }catch (IOException e){
            e.getMessage();
        }

        finally {
            is.close();
            os.close();

        }


    }

    private static void Copyfilejava07(File source,File dest)throws IOException{
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void main(String[] args) {
        System.out.println("\n" +
                "enter source path");
        Scanner value=new Scanner(System.in);
        String s= value.nextLine();
        System.out.println("enter dest path");
        String d=value.nextLine();
        File t=new File(s);
        File z=new File(d);
        try {
            Copyfilejava07(t,z);
            System.out.println("the fle is copy");
        }catch (IOException e){
            e.getMessage();
            System.out.println("the file not found");
        }catch (InvalidPathException e){
            e.getMessage();
            System.out.println("file bị lỗi ");
        }

    }
}
