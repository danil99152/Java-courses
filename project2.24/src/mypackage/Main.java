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
                if (a[i][j] <= a[i+1][j]) {continue;}
                else{
                    if (i==0 && a[i][j] <= a[i+1][j]) {continue;}
                    else if (a[i][j] > a[i+1][j]){
                        if (a[i][j] > a[i][j+1]){
                            if (a[i][j] > a[i+1][j+1]) {
                                if (a[i][j] > a[i + 1][j - 1] && j > 0) {
                                    int max = a[i][j];
                                    System.out.println("локальный максимум: " + max + " Его координаты: x: " + (j + 1) + ", y: " + (i + 1));
                                }
                            }
                        }
                    }
                    if (j==0 && a[i][j] <= a[i][j+1]) {continue;}
                    else if (a[i][j] > a[i][j+1]){
                        if (a[i][j] > a[i+1][j]){
                            if (a[i][j] > a[i+1][j+1]) {
                                if (a[i][j] > a[i - 1][j + 1] && i > 0) {
                                    int max = a[i][j];
                                    System.out.println("локальный максимум: " + max + " Его координаты: x: " + (j + 1) + ", y: " + (i + 1));
                                }
                            }
                        }
                    }
                    if (i!=0 && a[i][j] <= a[i-1][j]) {continue;}
                    else if(i!=0 && a[i][j] > a[i-1][j]) {
                        if (a[i][j] <= a[i][j+1]){continue;}
                        else {
                            if (j!=0 && a[i][j-1] >= a[i][j]){continue;}
                            else if (j!=0 && a[i][j-1] < a[i][j]){
                                if (a[i][j]<=a[i+1][j+1]){continue;}
                                else {
                                    if (a[i][j]<=a[i-1][j-1]){continue;}
                                    else if(a[i][j]>a[i-1][j-1]){
                                        if (a[i][j]<=a[i+1][j-1]){continue;}
                                        else if (a[i][j]>a[i+1][j-1]){
                                            if (a[i][j]<=a[i-1][j+1]){continue;}
                                            else if (a[i][j]>a[i-1][j+1]){
                                                int max = a[i][j];
                                                System.out.println("локальный максимум: " + max + " Его координаты: x: " + (j+1) + ", y: " + (i+1));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}