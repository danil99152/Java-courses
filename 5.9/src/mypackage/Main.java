/*
5.9 Факториал 𝑛! можно вычислить по следующей рекуррентной формуле:
𝑛! = 1, если 𝑛 = 1;
𝑛 ∗ 𝑛 − 1 !, если 𝑛 > 1.
Реализовать нерекурсивное вычисление факториала по указанной формуле. Использовать стек
*/

package mypackage;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> Number = new Stack<>();
        System.out.print("n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n>1) {
            while (n != 1) {
                Number.push(n);
                n--;
            }
            int m = 1;
            for (Integer k : Number){
                m = m * k;
            }
            System.out.println("n! = " + m);
        }
        else if (n == 0 || n == 1){
            System.out.println("n! = 1");
        }
        else {
            System.out.println("Факториал не уважает отрицательные числа");
        }
    }
}