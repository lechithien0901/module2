package ss016_java.io.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public List<Integer> readFile(String filepath){
        List<Integer>list=new ArrayList<>();
        try{
            File file=new File(filepath);
            if (!file.exists()){
                throw new FileNotFoundException("file not found"+filepath);
            }
            if (!file.isFile()){
                throw new IOException("this is not find");
            }
            if (!file.canRead()){
                throw new IOException("this file not read"+filepath);
            }
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line="";
            while((line=bufferedReader.readLine())!=null){
                list.add(Integer.parseInt(line));

            }
            bufferedReader.close();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        return list;

    }
    public void writeFile(String filePath, List<Integer>list) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("the arraylist add element is "+list);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
