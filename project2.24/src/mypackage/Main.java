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
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++){
            a[i]=(int)(Math.random()*10);
            System.out.print(a[i]+" ");
        }
        System.out.print("\n");
        int max = 0, j = 0, k=0;
        for (int i = 0; i < n; i++){
            if (i != 0 && i != (n-1) && a[i] >= a[i-1] && a[i] >= a[i+1]){
                max = a[i];
                j = i + 1;
                k++;
                System.out.print(k + "-й локальный максимум: " + max + " Его координаты: "+ j + "\n");
            }
        }
    }
}