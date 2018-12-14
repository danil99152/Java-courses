/* 1.9 Вводить с клавиатуры последовательность целых числа до 0 (сам 0 не входит в последовательность).
Найти номер первого из чисел с максимальным значением, вывести
результат на консоль. */

package mypackage;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int max = 0;
        int i=0;
        int index=0;
        System.out.println("Вводите последовательность чисел через Enter");
        do {
            num = scanner.nextInt();
            i++;
            if (max < num) {
                max = num;
                index = i;
            }
            if (num == 0) {
                System.out.println("Максимальное число = " + max + "; Индекс этого числа = " + index);
            }
        }
        while (num != 0);
    }
}