package ss016_java.io.pratice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileText {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br=new BufferedReader(new FileReader(filePath));
            String line="";
            int sum=0;
            while((line= br.readLine())!=null){
//                đọc đến dấu enter thì nó sẽ gán cho mình
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            br.close();
            System.out.println( "Total  :"+sum);

        }catch (Exception e){
            System.out.println("file does not exist");
        }
        }

    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("entry the link here :");
        String s= value.nextLine();
        ReadFileText readFileText=new ReadFileText();
        readFileText.readFileText(s);
    }

}
