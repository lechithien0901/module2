package demo;


  import java.util.HashMap;
import java.util.Map;
public class tà {

        public static void main(String[] args) {
            String input = "This is a sample input string. Let's count the occurrences of each word in this string.";


            String[] words = input.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s");

for(String word : words){
    System.out.println(word);
}
            Map<String, Integer> wordCounts = new HashMap<>();


            for (String word : words) {
                if (!wordCounts.containsKey(word)) {
                    wordCounts.put(word, 1);
                } else {
                    wordCounts.put(word, wordCounts.get(word) + 1);
                }
            }


            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }


