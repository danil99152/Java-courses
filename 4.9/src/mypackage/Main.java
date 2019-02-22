/*
4.9 Текст. Текст можно представить как последовательность предложений, а предложение - как последовательность слов и знаков. Реализовать необходимые классы для
формирования текста. По тексту реализовать построение частотного словаря.
*/

package mypackage;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main extends dictionary {

    public static void main(String[] args) {
        System.out.print("Введите предложение:\n");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Map<String, Integer> wordCounts = new HashMap<>();
    //    dictionary dictionary = new dictionary();
        dictionary(str);
    }
}

