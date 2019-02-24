/*
4.9 Текст. Текст можно представить как последовательность предложений, а предложение - как последовательность слов и знаков.
Реализовать необходимые классы для формирования текста. По тексту реализовать построение частотного словаря.
*/

package mypackage;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Text currentText = new Text("C:\\Users\\Danil\\IdeaProjects\\4.9\\src\\mypackage\\Input.txt");

        try{
            currentText.createtext();
        }catch (IOException e) {
            System.out.println(e);
        }

        String text = currentText.getWholeText();

        Map<String, Integer> wordCounts = new HashMap<>();

        int i = 0;
        for (String word : text.split("[^A-Za-zА-Яа-я]")) {
            if (word.length() > 0) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                i++;
            }
        }
        System.out.println(wordCounts);
        System.out.println("Кол-во слов: "+ i);
    }
}