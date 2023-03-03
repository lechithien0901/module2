package ss016_java.io.exercise;

import java.util.ArrayList;
import java.util.List;

public class ReadAndCopy {
    public static List<Integer> readAndCopy(List<Integer>number){
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i < number.size() ; i++) {
            list.add(number.get(i));

        }
        return list;
    }

    public static void main(String[] args) {
        CopyFile copyFile=new CopyFile();
      List<Integer>list=new ArrayList<>();
      list=copyFile.readFile("D:\\Module02\\untitled1\\ss016_java\\io\\exercise\\mainfile");

    copyFile.writeFile("D:\\Module02\\untitled1\\ss016_java\\io\\exercise\\destinationfile.txt",list);

    }

}
