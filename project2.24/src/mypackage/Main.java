/*
2.24. Дана вещественная случайная матрица. Найти координаты всех её локальных максимумов.
Локальным максимумом называется такой элемент матрицы, который больше
всех своих соседей. Соседом элемента матрицы называется такой её другой элемент,
координаты которого отличаются от координат данного элемента не более, чем на 1.
*/
package mypackage;

import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите размерность матрицы: ");
        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("\n");
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != 0 &&
                    i != (n - 1) &&
                    j != 0 &&
                    j != (n - 1) &&
                    a[i][j] >= a[i - 1][j] &&
                    a[i][j] >= a[i + 1][j] &&
                    a[i][j] >= a[i][j - 1] &&
                    a[i][j] >= a[i][j + 1] &&
                    a[i][j] >= a[i - 1][j - 1] &&
                    a[i][j] >= a[i + 1][j + 1] &&
                    a[i][j] >= a[i - 1][j + 1] &&
                    a[i][j] >= a[i + 1][j - 1]) {
                    int max = a[i][j];
                    int m = i + 1;
                    int p = j +1;
                    k++;
                    System.out.print(k + "-й локальный максимум: " + max + " Его координаты: " + m + ", " + p + "\n");
                }
            }
        }
    }
}