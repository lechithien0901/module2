package ss016_java.io.pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FindMaxValue {
  public static int findMaxValue(List<Integer> numbers){
      int max=numbers.get(0);
      for (int i = 0; i <numbers.size() ; i++) {
          if (max<numbers.get(i)){
              max=numbers.get(i);

          }

      }
      return max;
  }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile=new ReadAndWriteFile();
        List<Integer>list=new ArrayList<>();
       list= readAndWriteFile.readFile("D:\\Module02\\untitled1\\ss016_java\\io\\pratice\\numbers.txt");
        int maxvalue=findMaxValue(list);
        readAndWriteFile.writeFile("D:\\Module02\\untitled1\\ss016_java\\io\\pratice\\result.txt",maxvalue);
    }
}