package ss011_dsa_stack_queue.exercise;
import java.util.Locale;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        String input=value.nextLine();
        String []output=input.replaceAll("^a-zA-Z","").toLowerCase().split("\\s+");
        Map<String,Integer>words=new HashMap<>();
        for(String word:output){
            if (!words.containsKey(word)){
                words.put(word,1);
            }else {
            words.put(word,words.get(word)+1);
        }}
        for (Map.Entry<String,Integer> entry : words.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }
}
