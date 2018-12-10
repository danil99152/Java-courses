/* 1.24 Даны натуральные числа a1, b1, a2, b2. Найти сумму дробей a1/b1 + a2/b2 в виде смешанной
дроби с выделенной целой частью. */

package mypackage;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        System.out.println(a1/b1+a2/b2);
    }
}