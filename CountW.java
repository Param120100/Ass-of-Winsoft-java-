import java.util.HashMap;
import java.util.Map;

public class CountW {

    public static void main(String[] args) {
        String str = "My my Name  Name is Param!";

        
        Map<String, Integer> wordCounts = new HashMap<>();

        
        String[] words = str.split(" ");

        
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