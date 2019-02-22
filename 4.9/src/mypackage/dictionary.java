package mypackage;

import java.util.HashMap;
import java.util.Map;

public class dictionary {

    public static void dictionary(String str) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : str.split("[^A-Za-zА-Яа-я]")) {
            if (word.length() > 0) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println(wordCounts);
    }
}
