package ss016_java.io.pratice;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException("Không tìm thấy file " + filePath);
            }

            if (!file.isFile()) {
                throw new IOException(filePath + " không phải là file");
            }

            if (!file.canRead()) {
                throw new IOException("Không thể đọc nội dung của file " + filePath);
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    throw new IOException("Nội dung của file " + filePath + " không phải là số nguyên");
                }
            }
            br.close();

            if (numbers.isEmpty()) {
                throw new IOException("Nội dung của file " + filePath + " là rỗng");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return numbers;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}