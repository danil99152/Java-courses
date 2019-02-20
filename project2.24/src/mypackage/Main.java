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
        int[][] a = new int[n+1][n+1];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("\n");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                int max = 1, p = 0, m = 0;
                if (i == 0 && j == 0) {
                    for (int y = 0; y <= 1; y++) {
                        if (max==0) break;
                        for (int x = 0; x <= 1; x++) {
                            if (a[i][j] > a[y][x] || (y==i && x==j)){
                                max = a[i][j];
                                p = i;
                                m = j;
                            }
                            else {
                                max = 0;
                                break;
                            }
                        }
                    }
                } else if (i > 0 && j > 0) {
                    for (int y = i - 1; y <= i + 1; y++) {
                        if (max==0) break;
                        for (int x = j - 1; x <= j + 1; x++) {
                            if (a[i][j] > a[y][x] || (y==i && x==j)){
                                max = a[i][j];
                                p = i;
                                m = j;
                            }
                            else {
                                max = 0;
                                break;
                            }
                        }
                    }
                } else if (i > 0 && j == 0) {
                    for (int y = i - 1; y <= i + 1; y++) {
                        if (max==0) break;
                        for (int x = 0; x <= 1; x++) {
                            if (a[i][j] > a[y][x] || (y==i && x==j)){
                                max = a[i][j];
                                p = i;
                                m = j;
                            }
                            else {
                                max = 0;
                                break;
                            }
                        }
                    }
                } else if (i == 0 && j > 0) {
                    for (int y = 0; y <= 1; y++) {
                        if (max==0) break;
                        for (int x = j - 1; x <= j + 1; x++) {
                            if (a[i][j] > a[y][x] || (y==i && x==j)){
                                max = a[i][j];
                                p = i;
                                m = j;
                            }
                            else {
                                max = 0;
                                break;
                            }
                        }
                    }
                }
                if (max != 0) {
                    System.out.println("локальный максимум: " + max + " Его координаты: x: " + (m + 1) + ", y: " + (p + 1));
                }
            }
        }
    }
}